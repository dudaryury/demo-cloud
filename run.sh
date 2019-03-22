#!/bin/bash

declare -a array
array=(eureka config-server gateway random-web)

for app in "${array[@]}"; do 
echo "========== run $app app ============"
 docker-compose up -d $app;
 sleep 10;
done

exit 0




