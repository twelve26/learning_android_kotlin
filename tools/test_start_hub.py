#!/usr/bin/env python3
"""Exercise the local hub's command gate without invoking Gradle."""

import http.client
import json
import threading
import unittest
from http.server import ThreadingHTTPServer
from unittest.mock import patch

from start_hub import ALLOWED, KOTLIN, make_handler


class HubRunnerTest(unittest.TestCase):
    def test_every_allowed_id_has_a_matching_test_class(self):
        self.assertEqual(len(ALLOWED), 10)
        for test_class in ALLOWED.values():
            self.assertTrue((KOTLIN / "level-01-values" / "tests" / f"{test_class.split('.')[-1]}.kt").is_file())

    @classmethod
    def setUpClass(cls):
        cls.server = ThreadingHTTPServer(("127.0.0.1", 0), make_handler("test-token", threading.Lock()))
        cls.thread = threading.Thread(target=cls.server.serve_forever, daemon=True)
        cls.thread.start()

    @classmethod
    def tearDownClass(cls):
        cls.server.shutdown()
        cls.server.server_close()
        cls.thread.join()

    def request(self, method, path, body=None, headers=None):
        connection = http.client.HTTPConnection("127.0.0.1", self.server.server_port, timeout=5)
        connection.request(method, path, body=body, headers=headers or {})
        response = connection.getresponse()
        data = response.read()
        connection.close()
        return response.status, data

    def test_page_receives_session_token(self):
        status, body = self.request("GET", "/progress.html")
        self.assertEqual(status, 200)
        self.assertIn(b"const runnerToken = 'test-token'", body)
        self.assertIn(b"runnerToken !== '__RUNNER_TOKEN__'", body)

    def test_hidden_repository_files_are_not_served(self):
        status, _ = self.request("GET", "/.git/config")
        self.assertEqual(status, 404)

    def test_only_allowlisted_test_reaches_runner(self):
        headers = {
            "Content-Type": "application/json",
            "Origin": f"http://127.0.0.1:{self.server.server_port}",
            "X-Hub-Token": "test-token",
        }
        with patch("start_hub.run_test", return_value={"id": "K001", "passed": False}) as runner:
            status, _ = self.request("POST", "/api/test", json.dumps({"id": "K001"}), headers)
            self.assertEqual(status, 200)
            runner.assert_called_once_with("K001")
            status, _ = self.request("POST", "/api/test", json.dumps({"id": "K011"}), headers)
            self.assertEqual(status, 400)
            runner.assert_called_once()
            status, _ = self.request("POST", "/api/test", json.dumps({"id": ["K001"]}), headers)
            self.assertEqual(status, 400)
            runner.assert_called_once()

    def test_origin_and_token_are_required(self):
        body = json.dumps({"id": "K001"})
        with patch("start_hub.run_test") as runner:
            status, _ = self.request("POST", "/api/test", body, {"Origin": "http://evil.test", "X-Hub-Token": "test-token"})
            self.assertEqual(status, 403)
            status, _ = self.request("POST", "/api/test", body, {"Origin": f"http://127.0.0.1:{self.server.server_port}"})
            self.assertEqual(status, 403)
            runner.assert_not_called()


if __name__ == "__main__":
    unittest.main()
