FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY . .
RUN chmod +x gradlew \
    && ./gradlew bootJar -x test --no-daemon \
    && cp "$(ls build/libs/*.jar | grep -v plain | head -n 1)" app.jar

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
