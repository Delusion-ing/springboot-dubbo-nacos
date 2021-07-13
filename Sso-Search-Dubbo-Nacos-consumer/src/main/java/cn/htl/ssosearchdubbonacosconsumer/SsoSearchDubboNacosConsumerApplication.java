package cn.htl.ssosearchdubbonacosconsumer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan // dubbo相关注解扫描
@SpringBootApplication
public class SsoSearchDubboNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoSearchDubboNacosConsumerApplication.class, args);
    }

}
