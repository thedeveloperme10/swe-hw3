FROM openjdk:17
EXPOSE 8080
ADD target/swe-645-cicd-hw3.jar swe-645-cicd-hw3.jar
ENTRYPOINT ["java", "-jar", "/swe-645-cicd-hw3.jar"]