# spring-boot-hello-world

A simple Spring Boot app with all Actuator endpoints enabled. Designed simply to demonstrate that 
calling /shutdown on an instance of this app running in Cloud Foundry will cause Cloud Foundry to remove the 
stopped instance(s) and to bring the total number of instances up to the configured value.

Other interesting actuator endpoints: http://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html

To build this app, you will need Maven installed. 
`mvn clean package`

