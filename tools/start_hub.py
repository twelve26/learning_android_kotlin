#!/usr/bin/env python3
"""Serve the offline hub and run an allowlisted Kotlin level-01 test locally."""

import argparse
import json
import secrets
import subprocess
import threading
import time
import webbrowser
from http.server import SimpleHTTPRequestHandler, ThreadingHTTPServer
from pathlib import Path
from urllib.parse import unquote, urlsplit

ROOT = Path(__file__).resolve().parents[1]
KOTLIN = ROOT / "01-kotlin"
ALLOWED = {f"K{number:03}": f"k{number:03}.K{number:03}Test" for number in range(1, 11)}
MAX_OUTPUT = 24000
MAX_REQUEST = 4096
RUN_TIMEOUT = 300


def run_test(lesson_id):
    """Use fixed Gradle arguments; the request never supplies a command or path."""
    test_class = ALLOWED[lesson_id]
    command = ["./gradlew", ":level-01-values:test", "--tests", test_class, "--console=plain"]
    started = time.monotonic()
    try:
        result = subprocess.run(
            command, cwd=KOTLIN, capture_output=True, text=True,
            errors="replace", timeout=RUN_TIMEOUT, check=False,
        )
        output = (result.stdout + "\n" + result.stderr).strip()
        return {
            "id": lesson_id,
            "passed": result.returncode == 0,
            "exitCode": result.returncode,
            "timedOut": False,
            "durationSeconds": round(time.monotonic() - started, 1),
            "output": output[-MAX_OUTPUT:],
        }
    except subprocess.TimeoutExpired as error:
        stdout = error.stdout or b""
        stderr = error.stderr or b""
        if isinstance(stdout, str):
            stdout = stdout.encode("utf-8", "replace")
        if isinstance(stderr, str):
            stderr = stderr.encode("utf-8", "replace")
        output = stdout + b"\n" + stderr
        return {
            "id": lesson_id, "passed": False, "exitCode": None, "timedOut": True,
            "durationSeconds": round(time.monotonic() - started, 1),
            "output": output.decode("utf-8", "replace")[-MAX_OUTPUT:],
        }
    except OSError as error:
        return {
            "id": lesson_id, "passed": False, "exitCode": None, "timedOut": False,
            "durationSeconds": round(time.monotonic() - started, 1),
            "output": f"Could not start Gradle: {error}",
        }


def make_handler(token, run_lock):
    class HubHandler(SimpleHTTPRequestHandler):
        def __init__(self, *args, **kwargs):
            super().__init__(*args, directory=str(ROOT), **kwargs)

        def allowed_host(self):
            return self.headers.get("Host") == f"127.0.0.1:{self.server.server_port}"

        def send_json(self, status, payload):
            data = json.dumps(payload).encode("utf-8")
            self.send_response(status)
            self.send_header("Content-Type", "application/json; charset=utf-8")
            self.send_header("Content-Length", str(len(data)))
            self.send_header("Cache-Control", "no-store")
            self.end_headers()
            self.wfile.write(data)

        def do_GET(self):
            if not self.allowed_host():
                self.send_error(403, "Invalid host")
                return
            path = unquote(urlsplit(self.path).path)
            private_parts = {"build", "local.properties", "DerivedData", "xcuserdata"}
            if any(
                part.startswith(".") or part in private_parts
                for part in path.split("/") if part
            ):
                self.send_error(404, "File not found")
                return
            if path in {"/progress.html", "/"}:
                html = (ROOT / "progress.html").read_text().replace("__RUNNER_TOKEN__", token, 1)
                data = html.encode("utf-8")
                self.send_response(200)
                self.send_header("Content-Type", "text/html; charset=utf-8")
                self.send_header("Content-Length", str(len(data)))
                self.send_header("Cache-Control", "no-store")
                self.end_headers()
                self.wfile.write(data)
                return
            super().do_GET()

        def do_HEAD(self):
            self.send_error(405, "Use GET")

        def do_POST(self):
            if not self.allowed_host() or self.path != "/api/test":
                self.send_json(403, {"error": "Forbidden request."})
                return
            origin = f"http://127.0.0.1:{self.server.server_port}"
            if self.headers.get("Origin") != origin or self.headers.get("X-Hub-Token") != token:
                self.send_json(403, {"error": "Invalid session or origin."})
                return
            try:
                length = int(self.headers.get("Content-Length", "0"))
                if not 0 < length <= MAX_REQUEST:
                    raise ValueError("Invalid request size")
                payload = json.loads(self.rfile.read(length))
                lesson_id = payload.get("id") if isinstance(payload, dict) else None
            except (ValueError, json.JSONDecodeError):
                self.send_json(400, {"error": "Invalid JSON request."})
                return
            if not isinstance(lesson_id, str) or lesson_id not in ALLOWED:
                self.send_json(400, {"error": "Only Kotlin level 01 tests are available."})
                return
            if not run_lock.acquire(blocking=False):
                self.send_json(409, {"error": "A test is already running. Try again shortly."})
                return
            try:
                self.send_json(200, run_test(lesson_id))
            finally:
                run_lock.release()

    return HubHandler


def main():
    parser = argparse.ArgumentParser(description="Open the offline learning hub with local Kotlin level-01 test buttons.")
    parser.add_argument("--port", type=int, default=8766)
    parser.add_argument("--no-open", action="store_true", help="Do not open a browser automatically")
    args = parser.parse_args()
    token = secrets.token_urlsafe(32)
    try:
        server = ThreadingHTTPServer(("127.0.0.1", args.port), make_handler(token, threading.Lock()))
    except OSError as error:
        parser.exit(1, f"Could not start the hub: {error}\n")
    url = f"http://127.0.0.1:{server.server_port}/progress.html"
    print(f"Learning hub: {url}", flush=True)
    print("Press Ctrl+C to stop the local server.", flush=True)
    if not args.no_open:
        webbrowser.open(url)
    try:
        server.serve_forever()
    except KeyboardInterrupt:
        pass
    finally:
        server.server_close()


if __name__ == "__main__":
    main()
