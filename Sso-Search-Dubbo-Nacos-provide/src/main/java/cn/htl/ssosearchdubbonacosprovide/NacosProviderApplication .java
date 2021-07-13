package cn.htl.ssosearchdubbonacosprovide;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan
class NacosProviderApplication  {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication .class, args);
    }

}
