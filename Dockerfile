FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package


FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/spring-boot-docker-1.0.jar
COPY --from=MAVEN_TOOL_CHAIN /tmp/${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
