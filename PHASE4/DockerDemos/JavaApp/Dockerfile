# base image
FROM eclipse-temurin:25

# workdir
WORKDIR /app

#copy the current folder (host) to the folder(/app) of the image/container
COPY ./my_java_project/ /app

# Testing
RUN echo "Before compiling App.java"
RUN ls -l # contents of /app folder in the docker image

RUN javac App.java

# Testing
RUN echo "After compiling App.java, we should see App.class listed in the ls -l command"
RUN ls -l # contents of /app folder in the docker image

# command to execute when the container comes up
CMD java App
