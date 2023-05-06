FROM amazoncorretto:20-alpine-jdk
COPY target/miPorfolio-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
