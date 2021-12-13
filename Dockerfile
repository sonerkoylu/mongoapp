FROM openjdk:11
EXPOSE 8080
EXPOSE 8081
VOLUME /tmp
ARG JAR_FILE
COPY target/mongoapp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]