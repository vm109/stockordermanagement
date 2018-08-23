FROM java:8-jre-alpine
RUN ["mkdir","/app"]
COPY ./target/stockordermanagement-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java","-jar","-Dspring.profile.active=default","/app/stockordermanagement-0.0.1-SNAPSHOT.jar"]