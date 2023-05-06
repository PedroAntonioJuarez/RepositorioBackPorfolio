FROM amazoncorretto:8-alpine-jdk
COPY target/miPorfolio-0.0.1-SNAPSHOT.jar appPorfolio.jar
ENTRYPOINT ["java","-jar","/appPorfolio.jar"]
