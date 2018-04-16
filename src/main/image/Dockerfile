FROM openjdk:8-slim

WORKDIR /opt/webapp

ENTRYPOINT ["java", "-jar", "webapp.jar"]
COPY webapp-${project.version}.jar webapp.jar