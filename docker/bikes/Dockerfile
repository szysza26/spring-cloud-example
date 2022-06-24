FROM openjdk:11

RUN apt-get update && apt-get install -y maven
COPY ./bikes /app
RUN cd /app && mvn clean package -Dmaven.test.skip=true

ENTRYPOINT ["java","-jar","/app/target/bikes-0.0.1-SNAPSHOT.jar"]