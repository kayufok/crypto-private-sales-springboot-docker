FROM openjdk:8-jdk-alpine
COPY target/investment-0.0.1-SNAPSHOT.jar investment-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/investment-0.0.1-SNAPSHOT.jar"]