### 1.安装启动consul
    1.windows安装
        a.下载地址：https://www.consul.io/downloads.html
        b.环境变量配置 
        c.启动 consul agent -dev
 
### 2.配置application.properties
    spring.cloud.consul.port=8500 #默认端口
    spring.cloud.consul.host=localhost
    spring.cloud.consul.discovery.instance-id=consul-1

### 3.启动consulClient
    ConsulClientApplication.main()