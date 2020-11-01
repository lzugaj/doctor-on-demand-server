FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=build/libs/doctor-on-demand-server-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} doctor-on-demand-server.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/doctor-on-demand-server.jar"]