FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy application files
COPY target\backendecommerce-0.0.1-SNAPSHOT.jar app/
COPY application.properties app/

EXPOSE 8080

CMD ["java", "-jar", "app/backendecommerce-0.0.1-SNAPSHOT.jar"]