FROM openjdk:11

RUN apt-get update && apt-get install -y maven
COPY ./test /app
RUN cd /app && mvn clean package

ENTRYPOINT ["java","-jar","/app/target/test-0.0.1-SNAPSHOT.jar"]