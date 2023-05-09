FROM amazoncorretto:17

MAINTAINER Paula

COPY target/portfolio-0.0.1-SNAPSHOT.jar portfolio.jar

ENTRYPOINT ENTRYPOINT ["java","-jar","/portfolio.jar"]