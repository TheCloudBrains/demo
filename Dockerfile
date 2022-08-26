FROM openjdk:11
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT["java", "-jar", "/de mo-0.0.1-SNAPSHOT.jar"]