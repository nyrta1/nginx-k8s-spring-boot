FROM openjdk:23-jdk-bullseye
COPY target/nginx-k8s-server5.jar nginx-k8s-server5.jar
ENTRYPOINT ["java", "-jar", "/nginx-k8s-server5.jar"]
EXPOSE 8085