# Stage 1: Build Stage
FROM gradle:7.5.1-jdk17-alpine AS build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# Stage 2: Package Stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/trabalhoboer-0.0.1-SNAPSHOT.jar trabalhoboer.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","trabalhoboer.jar"]