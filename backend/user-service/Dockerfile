# Use OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy jar file (we will create it using Maven later)
COPY target/user-service-0.0.1-SNAPSHOT.jar user-service.jar

# Expose port (must match server.port in application.properties)
EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java", "-jar", "user-service.jar"]
