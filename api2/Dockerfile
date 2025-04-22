# Maven
FROM maven:3.9.9-amazoncorretto-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Spring Boot
FROM amazoncorretto:21
WORKDIR /app
COPY --from=build /app/target/api2-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

# Author: Allan Sergio V. Ferreira
LABEL version="1.0" \
description="Imagem Docker para a API 1 do Kafka Estudo" \
authors="Allan Sergio" \
maintainer="allansergio.dev@gmail.com"