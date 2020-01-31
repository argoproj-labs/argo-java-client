#!/usr/bin/env bash


java -cp /scripts/argoproj-java-client-openapi-generator.jar:/opt/openapi-generator/modules/openapi-generator-cli/target/openapi-generator-cli.jar org.openapitools.codegen.OpenAPIGenerator generate -g argo-java-client -i https://raw.githubusercontent.com/argoproj/argo/master/api/openapi-spec/swagger.json -o /generated-code/argo-java-client/

chmod -R 777 /generated-code/

exit 0