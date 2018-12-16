% Zalando RESTful API guidelines
% Lampros Papadimitriou
% December, 2018

# Principles

- Be liberal in what you accept
- Be conservative in what you send
- Treat you API as a product
- Be customer-oriented
- Act as a product owner

# API first

- Define API first!
- Follow standards
- Early review and feedback
- Free yourself from _HOW_ concerns

# Specifications

- Using terms: "MUST", "MUST NOT", "REQUIRED", "SHALL", "SHALL NOT", "SHOULD", "SHOULD NOT", "RECOMMENDED", "MAY", and "OPTIONAL"

# OpenAPI

- MUST provide API specification in YAML
- SHOULD provide API user manual online
- MUST provide metainformation (title, description, team, audience)
- MUST use semantic version

# Security

- MUST secure endpoints with OAuth 2.0
- MUST design and assign permissions

# Versioning

- MUST never break backwards compatibility
- SHOULD avoid versioning (MUST avoid URL versioning)
- SHOULD prefer compatible extensions
- Clients SHOULD not crash on compatible API extensions
- MUST use media type versioning
- MUST obtain approval of clients (e.g. deprecation)

# API design

- MUST always return JSON objects as top-level
- MUST property names  be ASCII snake_case (and never camelCase)
- SHOULD use additionalProperties
- SHOULD enumeration values as String
- SHOULD/MAY standards for Date, duration, currency, country, language

# Notes

## Principle

- Actively improve and maintain API consistency over long term
- Simple, comprehensive and usable API
