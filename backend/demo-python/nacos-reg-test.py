import nacos
from flask import Flask, send_file
from flask_restx import Resource, Api, reqparse, fields, abort

import os
from dotenv import load_dotenv

load_dotenv()
host = os.getenv('host')
port = os.getenv('port')

# Both HTTP/HTTPS protocols are supported, if not set protocol prefix default is HTTP, and HTTPS with no ssl check(verify=False)
# "192.168.3.4:8848" or "https://192.168.3.4:443" or "http://192.168.3.4:8848,192.168.3.5:8848" or "https://192.168.3.4:443,https://192.168.3.5:443"

app = Flask(__name__)
api = Api(app)

SERVER_ADDRESSES = "127.0.0.1:8848"
NAMESPACE = "public"
# no auth mode
client = nacos.NacosClient(SERVER_ADDRESSES, namespace=NAMESPACE)

@api.route('/stops')
class Stops(Resource):
    def get(self):
        return "12345"

if __name__ == "__main__":

    # auth mode
    # client = nacos.NacosClient(SERVER_ADDRESSES, namespace=NAMESPACE, ak="{ak}", sk="{sk}")
    client.add_naming_instance(service_name="python", ip=host, port=port, heartbeat_interval=5)

    # app.run(debug=True,host=os.environ["HOST"], port=int(os.environ["PORT"]))
    app.run(debug=True, host=host, port=port)