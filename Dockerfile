FROM openjdk:11

COPY build/libs/*.jar /deployments/app.jar

WORKDIR /deployments

RUN chmod 600 .

ENTRYPOINT ["java", "-jar", "app.jar"]