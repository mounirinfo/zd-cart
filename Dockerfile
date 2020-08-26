FROM adoptopenjdk/openjdk14:ubi
RUN mkdir /opt/app
COPY target/zd-cart-0.0.1-SNAPSHOT.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]