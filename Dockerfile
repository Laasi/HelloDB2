FROM tomcat:8-jre8
EXPOSE 8085:8080
MAINTAINER xyz1
ADD ./target/HelloDB2-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps