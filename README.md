# spring-cloud-demo-greeting
Simple Sping Boot Rest service that get the greeting from the config stored in [spring-cloud-config-data](https://github.com/hemanshupatira/spring-cloud-config-data)

## To Run
```
./gradlew bootRun
```

The server binds to a random available port. Multiple instance can be run in different terminals, all the instance will get registered to the [Eureka server](https://github.com/hemanshupatira/spring-eureka-server-demo)

To run with different profiles
```
./gradlew bootRun -Dspring.profiles.active=afternoon
```
