### Spring的基础
- IOC
- AOP
- MVC
- 注解与合成组件，注解的写法

### 应用场景 （详见spring.io）
- Serverless
### 宏观上来看，spring更多的时候值得是一个生态圈，在这个生态圈内我能够应用。 微观上，就是指的是Spring FrameWork

### SpringBoot解决的痛点，解决了**配置地狱问题**，Spring各种的配置问题，整合Spring技术栈。
- 自动Start依赖，简化构建配置
- 自动配置Spring以及第三方配置
- 能够提供生产级别的监控，健康检查及其外配置 （方便后期运维）
### SpringBoot方案 SpringBoot2基于Java8来实现，8有很多特性！
- Servlet Stack 原来的
- Reactive Stack 响应式的开发 => 不是很懂
### SpringBoot有点：看官网，直接抄 ，作为技术栈介绍
### SpringBoo + SpringCloud
- Cloud Native 云原生： 原生应用如何在云上部署 （尚硅谷的大厂学院： 全面拥抱云原生： Docker，Kubernets, DevOps, CI/CD, Service Mesh与Serverless）
> 解决的问题： 弹性伸缩，流量治理，负载均衡，灰度发布，自动化部署等

### 深入学的话还是看官方文档，刚开始文档比较难以理解，可以想通过看视频。有个大致了解之后，还是得回到文档。

##  Hello World案例
### 配置Maven使用阿里云的镜像能够加快依赖项的下载速度
```xml

```
### 依赖管理 pom.xml （具体查看语雀文档）
- 注意版本号是否兼容，查看项目中的依赖，有的依赖，在项目中是有默认版本，以及 maven网站中支持的版本号。

### 自动配置项 （查看语雀的文档）
- SpringBoot默认配置好了所有的web开发场景
- 自动被扫描的文件路劲和主程序（启动程序，在本项目中为 /main/com/example/demo/DemoApplication.java）同级
> 也就是说主程序所在的包能够自动被扫描到，我们的业务代码放在跟主程序同级别（文档中的经典的SpringBoot代码结构）。
```java
//自己可以改变扫描路径 这个是一个合成注解

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;

@SpringBootApplication
// 等同于
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
```
- 默认配置，我们自定义的配置 application.properties (有哪些配置项，自己查看文档，从cache到security)
- 自动配置 SpringBoot-web-starter 从开始, 哪些被引入，才会生效，是按需加载的。

### 容器组件
### 资料
- https://www.yuque.com/atguigu/springboot/lcfeme
- https://www.bilibili.com/video/BV19K4y1L7MT