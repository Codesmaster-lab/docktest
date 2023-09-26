FROM openjdk:19
EXPOSE 8081
ADD target/website.jar website.jar
ENTRYPOINT ["java","-jar","/website.jar"]