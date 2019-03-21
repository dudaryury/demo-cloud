FROM openjdk:8-jdk-alpine
MAINTAINER dudarwork@gmail.com
COPY target/eureka-server-0.0.1-SNAPSHOT.jar /app/eureka.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "eureka.jar"]
