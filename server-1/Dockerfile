FROM openjdk:23-jdk-bullseye
COPY target/nginx-k8s-server1.jar nginx-k8s-server1.jar
ENTRYPOINT ["java", "-jar", "/nginx-k8s-server1.jar"]
EXPOSE 8081
