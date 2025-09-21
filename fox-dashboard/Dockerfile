FROM amazoncorretto:25.0.0-alpine
WORKDIR /app
COPY ./dashboard/build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
