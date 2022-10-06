FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /demoDC
WORKDIR /demoDC
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","demo-0.0.1-SNAPSHOT.jar"]