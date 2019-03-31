FROM openjdk:8u181-jre-alpine3.8
VOLUME /tmp
ADD target/spring-boot-*.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]