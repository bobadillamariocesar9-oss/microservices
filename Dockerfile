# Stage 1: Build the application
# Usamos una imagen que incluye Maven y el JDK 17
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build

WORKDIR /app

# Copy the pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the application source code
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests


# Stage 2: Create the final, smaller image
# Usamos el JRE moderno y ligero
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the JAR from the build stage
COPY --from=build /app/target/catalog-service-1.0-SNAPSHOT.jar ./app.jar

# Expose the port the application runs on
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]