FROM openjdk:23-jdk-bullseye
COPY target/nginx-k8s-server4.jar nginx-k8s-server4.jar
ENTRYPOINT ["java", "-jar", "/nginx-k8s-server4.jar"]
EXPOSE 8084