#!/usr/bin/bash

set -e

docker build -t webapp:${project.version} -t webapp:latest target/
docker run --name webapp --rm -p 8080:8080 webapp:${project.version}