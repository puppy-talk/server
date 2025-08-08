FROM amazoncorretto:21-alpine-jdk

WORKDIR /application
COPY application-api/build/libs/application-api.jar app.jar

ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-Duser.timezone=Asia/Seoul", "-jar", "app.jar"]