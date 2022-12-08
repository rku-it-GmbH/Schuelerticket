# Schülerticket Schnittstelle
Deploy to Github Pages
- Build Project mvn package
- Run Project
- Extract openapi.json File from .../studentticketapi/v3/api-docs/studentticketapi
- place json-File at \docs\openapi
- Push to main

This could be automated in the future using the Springdoc-openapi Maven Plugin
https://springdoc.org/#maven-plugin
and Github Actions
