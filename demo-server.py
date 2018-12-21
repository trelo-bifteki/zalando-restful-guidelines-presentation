import connexion
import logging
import app

logging.basicConfig(level=logging.INFO)
app = connexion.App(__name__, specification_dir='swagger/')
app.add_api('customer-area-without-auth.yaml')
application = app.app

if __name__ == '__main__':
    app.run(port=8090)
