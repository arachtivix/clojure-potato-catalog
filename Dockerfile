FROM clojure:latest
EXPOSE 3000

COPY target/uberjar/potato-catalog-0.1.0-SNAPSHOT-standalone.jar /app/potato-catalog-uberjar.jar
WORKDIR /app
CMD ["java", "-jar", "potato-catalog-uberjar.jar"]