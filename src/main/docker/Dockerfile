FROM java:8

MAINTAINER cdy chendongyi_1996@163.com

VOLUME /logs

ADD istio-web-0.0.1-SNAPSHOT.jar istio-web.jar

RUN bash -c 'touch /istio-web.jar'

#ENV spring.profiles.active="test"

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "istio-web.jar","-Dspring.profiles.active=test"]
