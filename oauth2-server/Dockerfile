FROM openjdk:8-jdk-alpine
ARG JAR_FILE
VOLUME /tmp
COPY build/libs /opt/
RUN echo $JAR_FILE
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/oauth2-server-0.0.1-SNAPSHOT.jar"]
