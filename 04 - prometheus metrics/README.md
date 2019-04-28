查看度量数据
------
```
curl http://127.0.0.1:8080/actuator/prometheus
```

详细说明
------

```
# 最大文件处理数量
process_files_max_files 10240.0
# Tomcat 当前活跃 session 数量
tomcat_sessions_active_current_sessions 0.0
# Tomcat session 最大存活时间
tomcat_sessions_alive_max_seconds 0.0
# 预估的池中缓冲区的总容量
jvm_buffer_total_capacity_bytes{id="direct",} 81920.0
jvm_buffer_total_capacity_bytes{id="mapped",} 0.0
# 当前守护进程的线程数量
jvm_threads_daemon_threads 23.0
# 全局最长一次请求的时间
tomcat_global_request_max_seconds{name="http-nio-8080",} 10.007
# HELP tomcat_sessions_active_max_sessions
# 最大活跃 session 数量
tomcat_sessions_active_max_sessions 0.0
# CPU 利用率
system_cpu_usage 0.2865671641791045
# 预估 Java 虚拟机用于此缓冲池的内存
jvm_buffer_memory_used_bytes{id="direct",} 81920.0
jvm_buffer_memory_used_bytes{id="mapped",} 0.0
# 当前在 Java 虚拟机中加载的类的数量
jvm_classes_loaded_classes 7910.0
# 为 Java 虚拟机提交的内存量（以字节为单位）
jvm_memory_committed_bytes{area="heap",id="PS Survivor Space",} 1.6252928E7
jvm_memory_committed_bytes{area="heap",id="PS Old Gen",} 1.53092096E8
jvm_memory_committed_bytes{area="heap",id="PS Eden Space",} 1.77733632E8
jvm_memory_committed_bytes{area="nonheap",id="Metaspace",} 4.1680896E7
jvm_memory_committed_bytes{area="nonheap",id="Code Cache",} 9502720.0
jvm_memory_committed_bytes{area="nonheap",id="Compressed Class Space",} 5767168.0
# 当前线程数，包括守护进程和非守护进程的线程
jvm_threads_live_threads 27.0
# 配置的 Tomcat 的最大线程数
tomcat_threads_config_max_threads{name="http-nio-8080",} 200.0
# HELP tomcat_global_received_bytes_total
# Tomcat 接收到的数据量
tomcat_global_received_bytes_total{name="http-nio-8080",} 270.0
# Tomcat 发送的数据量
tomcat_global_sent_bytes_total{name="http-nio-8080",} 97342.0
# Tomcat 当前的线程数
tomcat_threads_current_threads{name="http-nio-8080",} 10.0
# Tomcat 创建的 session 数
tomcat_sessions_created_sessions_total 0.0
# 在一段时间内，排队到可用处理器的可运行实体数量和可用处理器上运行的可运行实体数量的总和的平均值
system_load_average_1m 5.51953125
# 过期的 session 数量
tomcat_sessions_expired_sessions_total 0.0
# 预估的池中的缓冲区数量
jvm_buffer_count_buffers{id="direct",} 10.0
jvm_buffer_count_buffers{id="mapped",} 0.0
# JVM 内存使用量
jvm_memory_used_bytes{area="heap",id="PS Survivor Space",} 0.0
jvm_memory_used_bytes{area="heap",id="PS Old Gen",} 2.1793344E7
jvm_memory_used_bytes{area="heap",id="PS Eden Space",} 1.62746832E8
jvm_memory_used_bytes{area="nonheap",id="Metaspace",} 3.9070768E7
jvm_memory_used_bytes{area="nonheap",id="Code Cache",} 9491136.0
jvm_memory_used_bytes{area="nonheap",id="Compressed Class Space",} 5289304.0
# Java 虚拟机的正常运行时间
process_uptime_seconds 1771.052
# 增加一个 GC 到下一个 GC 之后年轻代内存池的大小增加
jvm_gc_memory_allocated_bytes_total 8.3400336E7
# GC暂停耗时
jvm_gc_pause_seconds_count{action="end of major GC",cause="Metadata GC Threshold",} 1.0
jvm_gc_pause_seconds_sum{action="end of major GC",cause="Metadata GC Threshold",} 0.057
jvm_gc_pause_seconds_count{action="end of minor GC",cause="Metadata GC Threshold",} 1.0
jvm_gc_pause_seconds_sum{action="end of minor GC",cause="Metadata GC Threshold",} 0.014
# HELP jvm_gc_pause_seconds_max Time spent in GC pause
# TYPE jvm_gc_pause_seconds_max gauge
jvm_gc_pause_seconds_max{action="end of major GC",cause="Metadata GC Threshold",} 0.0
jvm_gc_pause_seconds_max{action="end of minor GC",cause="Metadata GC Threshold",} 0.0
# 被拒绝的 session 总数
tomcat_sessions_rejected_sessions_total 0.0
# Full GC 后的老年代内存池的大小
jvm_gc_live_data_size_bytes 2.1793344E7
# Tomcat 繁忙线程数
tomcat_threads_busy_threads{name="http-nio-8080",} 1.0
# 自 Java 虚拟机启动或峰值重置以来的最高活动线程数
jvm_threads_peak_threads 39.0
# 当前具有 NEW 状态的线程数
jvm_threads_states_threads{state="runnable",} 10.0
jvm_threads_states_threads{state="blocked",} 0.0
jvm_threads_states_threads{state="waiting",} 14.0
jvm_threads_states_threads{state="timed-waiting",} 3.0
jvm_threads_states_threads{state="new",} 0.0
jvm_threads_states_threads{state="terminated",} 0.0
# 老年代内存池的最大大小
jvm_gc_max_data_size_bytes 2.863661056E9
# 某个接口的请求数量和请求总时间
http_server_requests_seconds_count{exception="None",method="GET",outcome="SUCCESS",status="200",uri="/actuator/prometheus",} 10.0
http_server_requests_seconds_sum{exception="None",method="GET",outcome="SUCCESS",status="200",uri="/actuator/prometheus",} 0.146934156
# HELP http_server_requests_seconds_max
# TYPE http_server_requests_seconds_max gauge
http_server_requests_seconds_max{exception="None",method="GET",outcome="SUCCESS",status="200",uri="/actuator/prometheus",} 0.0
http_server_requests_seconds_max{exception="None",method="GET",outcome="SUCCESS",status="200",uri="/api/sleep",} 0.0
# GC之前到GC之后的老年代内存池大小的正增加计数
jvm_gc_memory_promoted_bytes_total 1.0939928E7
# 日志按级别计数
logback_events_total{level="warn",} 0.0
logback_events_total{level="debug",} 0.0
logback_events_total{level="error",} 0.0
logback_events_total{level="trace",} 0.0
logback_events_total{level="info",} 17.0
# 启动时间
process_start_time_seconds 1.556439756232E9
# 打开文件描述符的数量
process_files_open_files 101.0
# 异常数量
tomcat_global_error_total{name="http-nio-8080",} 0.0
# 可用于内存管理的最大内存量（以字节为单位）
jvm_memory_max_bytes{area="heap",id="PS Survivor Space",} 1.6252928E7
jvm_memory_max_bytes{area="heap",id="PS Old Gen",} 2.863661056E9
jvm_memory_max_bytes{area="heap",id="PS Eden Space",} 1.395130368E9
jvm_memory_max_bytes{area="nonheap",id="Metaspace",} -1.0
jvm_memory_max_bytes{area="nonheap",id="Code Cache",} 2.5165824E8
jvm_memory_max_bytes{area="nonheap",id="Compressed Class Space",} 1.073741824E9
# 最近的 CPU 利用率
process_cpu_usage 0.002344795186641643
# 自 Java 虚拟机开始执行以来卸载的类总数
jvm_classes_unloaded_classes_total 1.0
# CPU 核数
system_cpu_count 4.0
# 全局请求总数和总耗时
tomcat_global_request_seconds_count{name="http-nio-8080",} 15.0
tomcat_global_request_seconds_sum{name="http-nio-8080",} 14.239
```

Prometheus 数据结构
------

```
<metric name>{<label name>=<label value>, ...} value
```

Prometheus Metrics Value
------

Prometheus 度量值：float64，示例： 1.556439756232E9  = 1556439756.232