FROM openjdk:23-jdk-bullseye
COPY target/nginx-k8s-server2.jar nginx-k8s-server2.jar
ENTRYPOINT ["java", "-jar", "/nginx-k8s-server2.jar"]
EXPOSE 8082
