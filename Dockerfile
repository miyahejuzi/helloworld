FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar spring-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-docker.jar"]