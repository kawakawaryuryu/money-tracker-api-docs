# money-tracker-api-docs
Money Tracker API Documentation

## How to generate stub server
```bash
$ openapi-generator generate -i <openapi schema file> -g <generator name> -o <output dir>

# e.g.
$ openapi-generator generate -i openapi.yml -g nodejs-express-server -o nodejs-express-server
$ openapi-generator generate -i swagger.yml -g kotlin-spring -o kotlin-spring
```

## Reference
https://github.com/OpenAPITools/openapi-generator
