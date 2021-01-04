FROM openjdk:11-jdk
COPY ./target/greetings-1.0.0.jar "app.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar","app.jar"]