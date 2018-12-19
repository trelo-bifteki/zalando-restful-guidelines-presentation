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

# Useful tools

- swagger online editor
- connexion
- problem / problem-spring-web
- jackson-datatype-money
- intellij-swagger

# Observations about Zalando

- Teams serving other teams
- Agile project structures
- Strong appearance in Github
- Techblogs

# API naming

- Must Use lowercase separate words with hyphens for Path Segments
- Must Use snake_case for query parameters
- Must Pluralize resource names
- Must avoid trailing slashes
- Must stick to conventional query params
- Must avoid actions - think about resources (lvl 2)
- Must keep URLs verb-free
- Must identify resources and sub via path
- May consider not nested URLs

# HTTP requests

- GET for read
- PUT to update entire resources (replace)
- POST to create single resources
- PATCH update parts of single resources
- DELETE to delete resources
- HEAD to retrieve header infomation (Etag?)
- Prefer POST over PUT
- Use ETag & If-(None)-Match

# Http status codes and errors

- Use standard HTTP codes
- 201 CREATED (sync) vs 202 ACCEPTED (async)
- 207 (multi-status)
- 409 CONFLICT (concurrency problem)
- 412 PRECONDITION FAILED (If-Match mismatch)
- 423 Pessimistic locking
- 429 Too many requests

# Performance tips

- SHOULD Use gzip compression
- SHOULD reduce bandwidth needs and improve responsiveness
- SHOULD support filtering fields
- SHOULD support pagination
- SHOULD allow optional embedding
- MUST Document caching, if supported (default: Cache-Control: no-cache)

# Common field names
- id
- xyz_id
- created
- modified
- type
- etag

# Proprietary Headers

- X-Flow-ID (troubleshooting)
- X-Frontend-Type (mobile-app / browser)
- X-Device-Type (tablet, desktop)
- X-Device-OS (IOS, Android)

# API operations

- MUST Publish API Specifications (zalando-apis directory)

# Internal processes

- Use functional naming schema
- internal registry for components

# Notes

## Principle

- Actively improve and maintain API consistency over long term
- Simple, comprehensive and usable API
