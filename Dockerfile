FROM openjdk:8

ADD target/demoApp.jar demoApp.jar

EXPOSE 8085

ENTRYPOINT ["java","-jar","demoApp.jar"]
