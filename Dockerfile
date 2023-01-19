FROM openjdk:8
MAINTAINER xiefeng
VOLUME /tmp
ADD thor-1.0.0.jar thor.jar
RUN bash -c 'touch /thor.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/thor.jar"]