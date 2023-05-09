FROM amazoncorretto:17

MAINTAINER Paula

COPY target/portfolio-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ENTRYPOINT ["java","-jar","/app.jar"]