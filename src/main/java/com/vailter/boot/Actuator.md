转自：https://mp.weixin.qq.com/s/dW21UZw2duopYeBIw6w4bg
SpringBoot 是为了简化 Spring 应用的创建、运行、调试、部署等一系列问题而诞生的产物，
自动装配的特性让我们可以更好的关注业务本身而不是外部的XML配置，我们只需遵循规范，引入相关的依赖就可以轻易的搭建出一个 WEB 工程

actuator是spring boot项目中非常强大一个功能，有助于对应用程序进行监视和管理，通过 restful api请求来监管、审计、收集应用的运行情况，
针对微服务而言它是必不可少的一个环节…


Endpoints
actuator 的核心部分，它用来监视应用程序及交互，
spring-boot-actuator中已经内置了非常多的 Endpoints（health、info、beans、httptrace、shutdown等等），
同时也允许我们自己扩展自己的端点

内置Endpoints


导入依赖
属性配置
描述信息
自定义 - 重点
默认装配 HealthIndicators
健康端点（第一种方式）
健康端点（第二种方式）
定义自己的端点
主函数
测试
总结