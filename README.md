# How to use Redis as Hibernate 2nd Level Cache Demo with Spring Boot

This demo project accompanies the Medium article: 
[Scaling Spring Boot with Hibernate 2nd Level Cache on Redis](https://medium.com/@shahto/scaling-spring-boot-with-hibernate-2nd-level-cache-on-redis-54d588fc8b06)

## Content

- A Java demo Spring Boot application. Demonstrates 1st and 2nd Level Hibernate cache.
- H2 In-Memory database with schema and sample data.
## Stack
- Spring Boot (v3.0.1)
- Spring Data JPA
- H2 Database
- JUnit
- Lombok
- Requires Redis running locally (or dockerized) at default port 6379

## Run Redis on MacOS 

https://redis.io/docs/latest/operate/oss_and_stack/install/install-redis/install-redis-on-mac-os/
```shell
brew install redis
brew services start redis

brew services stop redis
```

### Connect to Redis CLI
```
redis-cli
```

### Redis commandsKEYS
```shell
KEYS *
MONITOR
FLUSHALL
HGETALL planetCache
```

## Run Redis in docker
```shell
docker pull redis
docker run --name redisDemo -d redis
docker exec -it redisDemo redis-cli
```