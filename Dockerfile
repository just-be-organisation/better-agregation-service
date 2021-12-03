FROM adoptopenjdk/openjdk11

MAINTAINER Vladyslav Yemelianov <emelyanov.vladyslav@gmail.com>

ADD ./target/aggregation-service.jar /app/
CMD ["java", "-Xmx512m", "-jar", "/app/aggregation-service.jar"]

EXPOSE 8080