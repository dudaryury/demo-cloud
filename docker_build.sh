#!/bin/bash
currentDir=$PWD
declare -a array
array=(eureka-server config-server gateway random-web)

for dir in "${array[@]}"; do 
echo "go to $dir folder"
cd $currentDir/$dir

echo "maven build"
mvn clean install -Dmaven.test.skip=true

echo "build docker image"
docker build --tag dudar/$dir:v1 .
done

exit 0




