FROM amazoncorretto:11-alpine-jdk
MAINTAINER Nicolas
COPY target/back-0.0.1-SNAPSHOT.jar back-app.jar
ENTRYPOINT ["java", "-jar", "/back-app.jar"]