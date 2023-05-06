FROM amazoncorretto:20-alpine-jdk
COPY target/miPorfolio-0.0.1-SNAPSHOT appPorfolio.jar
ENTRYPOINT ["java","-jar","/appPorfolio.jar"]
