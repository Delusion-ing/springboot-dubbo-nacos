package cn.htl.ssosearchdubbonacosprovide.impl;

import cn.htl.dubbo.springcloud.nacos.api.IHelloService;
import org.apache.dubbo.config.annotation.Service;


@Service(version = "1.0.0",group = "HelloGroup",interfaceClass = IHelloService.class)
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello Nacos: " + name;
    }
}
