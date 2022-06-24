FROM openjdk:11

RUN apt-get update && apt-get install -y maven
COPY ./notifications /app
RUN cd /app && mvn clean package

ENTRYPOINT ["java","-jar","/app/target/notifications-0.0.1-SNAPSHOT.jar"]