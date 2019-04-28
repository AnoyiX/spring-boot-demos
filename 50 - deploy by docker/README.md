
构建 Docker 镜像
-----

1、Maven 打包项目

```
mvn clean package
```

2、构建镜像
```
docker build -t demo .
```

Docker 部署

**1、简单启动**
```
docker run -d --name spring-boot-demo -p 8080:8080 demo
```

**2、配置 JVM**
```
docker run -d --name spring-boot-demo -p 8080:8080 -e JVM_PARAMS="-Xmx21824M -Xms21824M" demo
```

**3、配置额外的 Spring Boot 参数**
```
docker run -d --name spring-boot-demo -p 8080:8080 -e JVM_PARAMS="-Xmx21824M -Xms21824M" -e SPRING_PARAMS="--spring.profiles.active=prod" demo
```