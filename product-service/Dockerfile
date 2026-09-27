# Stage 1: Runtime
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Create a non-root user for security best practices
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

# Copy the built jar from target directory
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]