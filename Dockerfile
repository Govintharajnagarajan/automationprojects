FROM  eclipse-temurin:17
COPY target/automationproject.jar automationproject.jar
CMD [ "java","-jar","automationproject.jar" ]
