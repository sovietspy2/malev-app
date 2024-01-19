# Use the official OpenJDK image as a base image
FROM amazoncorretto:21-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file to the container
COPY target/*.jar /app/app.jar

# Expose the port that the application will run on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]