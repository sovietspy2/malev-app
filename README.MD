# Java 21 Spring Boot multi module project

- proper Maven structure
- Feign Client
- logging
- Swagger 
- Async
- Docker
- Maven publish to Docker Hub

## build and publish image
```mvn clean package docker:push```

## running with docker
```docker run -p 8080 -e SPRING_PROFILES_ACTIVE=dev sovietspy2/whoopworld```