FROM amazoncorretto:17

MAINTAINER Paula

COPY target/portfolio-0.0.1-SNAPSHOT.jar portfolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ENTRYPOINT ["java","-jar","/portfolio-0.0.1-SNAPSHOT.jar"]