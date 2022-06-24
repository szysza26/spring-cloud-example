FROM openjdk:11

RUN apt-get update && apt-get install -y maven
COPY ./gateway /app
RUN cd /app && mvn clean package

ENTRYPOINT ["java","-jar","/app/target/gateway-0.0.1-SNAPSHOT.jar"]