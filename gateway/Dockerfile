FROM openjdk:8-jdk-alpine
MAINTAINER dudarwork@gmail.com
COPY target/gateway-0.0.1-SNAPSHOT.jar /app/gateway.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "gateway.jar"]
