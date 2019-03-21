FROM openjdk:8-jdk-alpine
MAINTAINER dudarwork@gmail.com
COPY target/config-server-0.0.1-SNAPSHOT.jar /app/config-server.jar
WORKDIR /app
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "config-server.jar"]
