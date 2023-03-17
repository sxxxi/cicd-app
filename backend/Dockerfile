# use --target <stage-name> to stop build at a specific stage.
# COPY --from=[ <image:version> | <build phase> ]


# Build stage
FROM maven:3.9.0-amazoncorretto-17 AS build
ENV HOME=/usr/app
RUN mkdir -p $HOME 
WORKDIR $HOME 
COPY pom.xml $HOME 
RUN mvn verify --fail-never

COPY . $HOME 
RUN mvn package 

# Exec(?) stage
FROM amazoncorretto:17
ENV HOME=/usr/app
COPY --from=build $HOME/target/prod-pkg.jar /usr/foo.jar
EXPOSE 8080
CMD [ "java", "-jar", "/usr/foo.jar" ]

