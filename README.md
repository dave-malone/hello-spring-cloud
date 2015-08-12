# spring-boot-hello-world

A simple Spring Boot app with all Actuator endpoints enabled. Designed simply to demonstrate that 
calling /shutdown on an instance of this app running in Cloud Foundry will cause Cloud Foundry to remove the 
stopped instance(s) and to bring the total number of instances up to the configured value.

This app was forked from another hello-world repo, but the dependencies on services has been removed to facilitate ease of
deployment for quick demo purposes.

Other interesting actuator endpoints: http://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html

To build this app, you will need Maven installed. 
`mvn clean package`

The /shutdown endpoint is an HTTP POST request:
`curl -X POST https://spring-boot-hello-world-demersal-capping.cfapps.pez.pivotal.io`  

