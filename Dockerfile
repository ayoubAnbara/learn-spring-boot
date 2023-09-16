# our base build image
FROM eclipse-temurin:17.0.6_10-jdk

LABEL org.opencontainers.image.authors="enset.ma"

ARG JAR_FILE=learn-spring-boot.jar

COPY target/*.jar /usr/local/lib/${JAR_FILE}

EXPOSE 8080

ENTRYPOINT ["java","-jar","/usr/local/lib/learn-spring-boot.jar"]
