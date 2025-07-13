FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/devops-docker.jar devops-docker.jar
ENTRYPOINT ["java","-jar","/devops-docker.jar"]