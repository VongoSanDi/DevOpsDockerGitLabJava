FROM tomcat:latest
COPY ./out/artifacts/DevOpsDockerGitlabJava_war/DevOpsDockerGitlabJava_war.war /usr/local/tomcat/webapps/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "DevOpsDockerGitlabJava_war-0.0.1-SNAPSHOT.war"]