## 1.项目介绍
这个项目是对微服务框架的学习
    
## 2.内容
   - 配置中心（Spring Cloud Config）
   
        配置管理工具包，让你可以把配置放到远程服务器，集中化管理集群配置，目前支持本地存储、Git以及Subversion
   - 服务注册中心
   
        Eureka云端服务发现，一个基于 REST 的服务，用于定位服务，以实现云端中间层服务发现和故障转移。
        Consul是一个服务发现与配置工具，与Docker容器可以无缝集成。
   
   - 动态路由（Zuul）
   
        是在云平台上提供动态路由,监控,弹性,安全等边缘服务的框架。Zuul 相当于是设备和 Netflix 流应用的 Web 网站后端所有请求的前门。

   - 负载均衡（Ribbon）
   
        提供云端负载均衡，有多种负载均衡策略可供选择，可配合服务发现和断路器使用。
   
        
   - 熔断器（Hystrix）
   
        熔断器，容错管理工具，旨在通过熔断机制控制服务和第三方库的节点,从而对延迟和故障提供更强大的容错能力。
   
   - 消息总线（Spring Cloud Bus）
    
        事件、消息总线，用于在集群（例如，配置变化事件）中传播状态变化，可与Spring Cloud Config联合实现热部署。
   
   
  