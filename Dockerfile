# Usa la imagen de Amazon Corretto
FROM amazoncorretto:17-alpine

WORKDIR /app

# Ejecuta Maven para construir el proyecto y generar el archivo JAR
RUN ./mvnw clean package -DskipTests

# Copia el archivo JAR desde el host al contenedor
COPY target/spring_api-0.0.1.jar app_campus.jar

# Expone el puerto 8080 para la comunicación de la aplicación
EXPOSE 8080

# Establece el comando que se ejecutará cuando se inicie el contenedor
ENTRYPOINT ["java","-jar","app_campus.jar"]