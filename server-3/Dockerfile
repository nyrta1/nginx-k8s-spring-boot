FROM openjdk:23-jdk-bullseye
COPY target/nginx-k8s-server3.jar nginx-k8s-server3.jar
ENTRYPOINT ["java", "-jar", "/nginx-k8s-server3.jar"]
EXPOSE 8083