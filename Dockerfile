FROM openjdk:19
EXPOSE 8081
ADD artifacts/website.jar website.jar
ENTRYPOINT ["java","-jar","/website.jar"]