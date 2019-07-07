FROM openjdk:8u212-jre

MAINTAINER cdy chendongyi_1996@163.com

VOLUME /logs

ADD istio-web-0.0.1-SNAPSHOT.jar istio-web.jar

RUN bash -c 'touch /istio-web.jar'

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "istio-web.jar"]
