FROM openjdk:8-alpine

COPY target/uberjar/clojure-guestbook-demo.jar /clojure-guestbook-demo/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojure-guestbook-demo/app.jar"]
