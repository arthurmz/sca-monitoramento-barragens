FROM maven:3.6.3-openjdk-8 as builder
COPY pom.xml app/
WORKDIR /app
RUN mvn dependency:go-offline
COPY src src
RUN mvn package
RUN cp target/*.jar app.jar


FROM openjdk:8-jre-alpine as runner
EXPOSE 8080
COPY --from=builder /app/app.jar /app/app.jar
WORKDIR /app
CMD ["java", "-jar", "app.jar"]
