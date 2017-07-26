FROM java:8
MAINTAINER lgphp
VOLUME /var
ADD springboot-mybatis-docker-0.0.1-SNAPSHOT.jar /var/app/springbootdemoApp.jar
WORKDIR /app/spring-boot-maven-docker/
EXPOSE 2001
ENTRYPOINT ["java" , "-Djava.security.egd=file:/dev/./urandom", "-jar" ,"/var/app/springbootdemoApp.jar"]