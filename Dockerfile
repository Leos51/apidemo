FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/*.jar /app/app.jar
ENV SPRING_DATASOURCE_URL=jdbc:mysql://mysql:3306/springboot
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=root
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar"]