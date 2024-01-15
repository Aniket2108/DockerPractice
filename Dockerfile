FROM openjdk:11-jdk-slim

WORKDIR /app

COPY SimpleFile.java .

RUN javac SimpleFile.java

CMD ["java", "SimpleFile"]