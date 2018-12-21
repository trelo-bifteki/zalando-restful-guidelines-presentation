from connexion import NoContent

CASES= [{"id": "1aad-adda"}]

def get_customer_cases():
    return { "items": CASES }

def get_customer_case(customerCaseId):
    return NoContent, 404
