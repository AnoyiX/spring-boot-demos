
配置说明
-----

| 配置项                     | 默认值         | 描述        |
| ------------------------- | ------------- | ----------- |
| graceful.shutdown.enabled | false         | 是否启用优雅停机 |
| graceful.shutdown.timeout | 60            | 在关闭 Tomcat Connector 之前等待活跃线程完成的秒数 |
| graceful.shutdown.wait    | 30            | 优雅停机前，服务处于 `OUT_OF_SERVICE` 的时间 |


优雅停机流程
-----

1. JVM 接受 SIGTERM 信号，开始关闭 Spring Container
2. Spring EventListener 监听 ContextClosedEvent 事件，关闭开始后回调
3. EventListener 更新 Spring Boot HealthIndicator 为 "OUT_OF_SERVICE"
4. 使用 Thread.sleep 延迟 Context 关闭，以便负载均衡器查看更新的 HealthIndicator 状态，并停止向此实例转发请求
5. 当 Thread.sleep 结束, Tomcat container 正常关闭。首先通过暂停 Connector，不再接受新的请求，然后通过配置的时间让 Tomcat 线程池处理活跃的线程
6. 最后, Spring Context 关闭
