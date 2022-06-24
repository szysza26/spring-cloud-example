FROM openjdk:11

RUN apt-get update && apt-get install -y maven
COPY ./eureka /app
RUN cd /app && mvn clean package

ENTRYPOINT ["java","-jar","/app/target/eureka-0.0.1-SNAPSHOT.jar"]