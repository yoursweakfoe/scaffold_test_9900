# FROM baseImage:tag - this specifies the base image and its version
FROM openjdk:17
# WORKDIR /the/workdir/path - path to use as the working directory
WORKDIR /usr/src/app
# Copy files or folders from source (on your laptop) to the dest path (in the image)
COPY target/gateway-0.0.1-SNAPSHOT.jar ./app.jar
# EXPOSE is used to specify all ports in the container that we will need
EXPOSE 8090
# CMD specifies the command used to start the application. We can only have one CMD statement in our Dockerfile
CMD ["java", "-jar", "app.jar"]
