FROM maven:3.6.3-openjdk-17

RUN mkdir job4j_dish

WORKDIR job4j_dish

COPY . .

RUN mvn package -Dmaven.test.skip

CMD ["java", "-jar", "target/job4j_dish-0.0.1-SNAPSHOT.jar"]