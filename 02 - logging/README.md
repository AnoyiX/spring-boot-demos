

**测试不同级别的日志输出**
```
# test error log
curl http://127.0.0.1:8080/log/error

# test warn log
curl http://127.0.0.1:8080/log/warn

# test info log
curl http://127.0.0.1:8080/log/info

# test debug log
curl http://127.0.0.1:8080/log/debug

# test trace log
curl http://127.0.0.1:8080/log/trace

```