# Use official Java runtime as a base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy jar file into container
COPY HelloWorld.jar app.jar

# Expose port
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "app.jar"]
