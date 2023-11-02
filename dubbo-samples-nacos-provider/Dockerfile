FROM maven:3.8.4-jdk-11 as builder

ADD dubbo-samples-nacos-provider-0.0.1-SNAPSHOT.jar dubbo-samples-nacos-provider-docker.jar

ENTRYPOINT ["java", "-jar", "/dubbo-samples-nacos-provider-docker.jar", "--spring.profiles.active=prod"]