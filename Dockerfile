FROM openjdk:latest
COPY ./target/seMethods.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "app-jar-with-dependencies.jar", "db:3306"]