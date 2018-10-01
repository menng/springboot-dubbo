Springboot结合Dubbo项目示例
---
此项目是Springboot结合Dubbo的示例，基于注解的方式。
参考文档[注解配置](http://dubbo.apache.org/zh-cn/docs/user/configuration/annotation.html)

### 启动
1. 本地启动zookeeper
2. 依次启动springboot-dubbo-provider，springboot-dubbo-consumer
3. 浏览器访问 localhost:8080/hello

### 依赖
- gradle-4.9
- springboot-1.15.16
- dubbo-2.6.3
- zookeeper-3.4.12