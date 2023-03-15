# Build stage
FROM maven:3.9.0-amazoncorretto-17 AS build
RUN mkdir -p /usr/src
WORKDIR /usr/src
COPY ./src /usr/src
COPY pom.xml /usr
RUN mvn -f /usr/pom.xml clean package

# Exec(?) stage
FROM amazoncorretto:17
COPY --from=build /usr/target/prod-pkg.jar /usr/foo.jar
EXPOSE 8080
CMD [ "java", "-jar", "/usr/foo.jar" ]
