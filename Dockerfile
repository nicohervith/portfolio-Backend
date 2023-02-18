FROM amazoncorretto:11-alpine-jdk
MAINTAINER Nicolas
COPY target/back-0.0.1-SNAPSHOT.jar back-0.0.1-SNAPSHOT.jar
ENTRYPOINT  ["java" , "/back-0.0.1-SNAPSHOT.jar"]