FROM openjdk:17-oracle
COPY ./target/Author_info-0.0.1-SNAPSHOT.jar Author_info.jar
CMD ["java","-jar","Author_info.jar"]