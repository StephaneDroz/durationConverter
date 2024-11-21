#!/bin/bash

JAR="./target/app.jar"
if [ ! -e "$JAR" ]; then
  echo "Compiling..."
  mvn clean package 1 > /dev/null
  echo "Compilation done."
fi

java -jar $JAR $1
