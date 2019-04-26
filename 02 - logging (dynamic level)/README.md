### Spring Boot 日志 - 动态级别修改

**设置默认的日志级别**
```
logging.level.root=INFO
```

**查看应用所有日志配置**
```
curl http://127.0.0.1:8080/actuator/loggers
```

**查看单个包/类日志配置**
```
curl http://127.0.0.1:8080/actuator/loggers/com.anoyi
```

**实时修改日志级别**
```
curl -X POST \
  http://localhost:8080/actuator/loggers/com.anoyi \
  -d '{"configuredLevel":"DEBUG"}'
```