# Use OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY target/cart-service-0.0.1-SNAPSHOT.jar cart-service.jar

# Expose the port (must match application.properties)
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "cart-service.jar"]
