FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/*.jar

EXPOSE 8088

ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]