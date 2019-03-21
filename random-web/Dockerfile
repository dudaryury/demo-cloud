FROM openjdk:8-jdk-alpine
MAINTAINER dudarwork@gmail.com
COPY target/random-web-0.0.1-SNAPSHOT.jar /app/random-web.jar
WORKDIR /app
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "random-web.jar"]
