FROM tomcat:latest
WORKDIR /usr/local/tomcat/webapps
RUN curl -O -L https://github.com/VongoSanDi/DevOpsDockerGitLabJava/tree/master/out/artifacts/DevOpsDockerGitlabJava_war.war
EXPOSE 8080
CMD ["/opt/tomcat/bin/catalina.sh", "run"]