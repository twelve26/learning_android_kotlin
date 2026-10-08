#!/usr/bin/env python3
"""Local deterministic fixture API. No account, external API or database required."""
from http.server import BaseHTTPRequestHandler, HTTPServer
import json
class Handler(BaseHTTPRequestHandler):
 def do_GET(self):
  routes={"/books":("text/plain",b"Kotlin field notes\nAndroid lab\nShared code"),"/books.json":("application/json",json.dumps([{"id":1,"title":"Kotlin"},{"id":2,"title":"Android"}]).encode()),"/empty":("text/plain",b"")}
  if self.path=="/fail": self.send_error(503,"Deterministic test failure");return
  if self.path not in routes:self.send_error(404);return
  kind,data=routes[self.path];self.send_response(200);self.send_header("Content-Type",kind);self.send_header("Content-Length",str(len(data)));self.end_headers();self.wfile.write(data)
if __name__=="__main__":
 print("Local fixture server: http://127.0.0.1:8765 (Ctrl+C to stop)")
 HTTPServer(("127.0.0.1",8765),Handler).serve_forever()
