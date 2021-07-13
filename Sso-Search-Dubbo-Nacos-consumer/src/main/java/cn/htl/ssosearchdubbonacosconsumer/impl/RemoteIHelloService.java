package cn.htl.ssosearchdubbonacosconsumer.impl;

import cn.htl.dubbo.springcloud.nacos.api.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class RemoteIHelloService implements IHelloService {
    @Reference(version = "1.0.0",group = "HelloGroup",interfaceClass = IHelloService.class)
    private IHelloService iHelloService;
    @Override
    public String sayHello(String name) {
        return iHelloService.sayHello(name);
    }
}
