#!/bin/bash

JAR="./target/app.jar"
if [ ! -e "$JAR" ]; then
  mvn clean package
fi

java -jar $JAR $1
