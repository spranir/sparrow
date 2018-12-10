from http.server import HTTPServer, BaseHTTPRequestHandler
import json
import os

class SimpleHTTPRequestHandler(BaseHTTPRequestHandler):

    def do_GET(self):     
        os.system("mkdir test")
        self.send_response(200)
        self.end_headers()
        self.wfile.write(b'hi')

with open('config.json') as f:
          data = json.load(f)
httpd = HTTPServer((data['url'], int(data['port'])), SimpleHTTPRequestHandler)
httpd.serve_forever()
