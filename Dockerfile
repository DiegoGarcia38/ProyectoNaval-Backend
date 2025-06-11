# Etapa 1: Build
FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app

# Copiar archivos de configuración de Maven
COPY pom.xml .

# Descargar dependencias
RUN mvn dependency:go-offline -B

# Copiar código fuente
COPY src ./src

# Compilar aplicación
RUN mvn clean package -DskipTests

# Etapa 2: Runtime
FROM openjdk:21-jdk-slim
RUN useradd -r -s /bin/false appuser
USER appuser

WORKDIR /app

# Copiar JAR desde etapa de build
COPY --from=build /app/target/ProyectoNaval-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app

# Exponer puerto
EXPOSE 8080

# Variables de entorno
ENV JAVA_OPTS="-Xms512m -Xmx1024m"

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=60s --retries=3 \
  CMD curl -f http://localhost:8080/api/health || exit 1

# Comando de inicio
ENTRYPOINT ["java","-jar","app.jar"]