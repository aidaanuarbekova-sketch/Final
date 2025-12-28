FROM eclipse-temurin:25-jdk
MAINTAINER Aida
COPY backend.jar playlist.jar
ENTRYPOINT ["java", "-jar", "playlist.jar"]