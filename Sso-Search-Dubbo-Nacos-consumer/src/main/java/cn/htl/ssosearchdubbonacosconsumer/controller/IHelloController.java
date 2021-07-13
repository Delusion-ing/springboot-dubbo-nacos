package cn.htl.ssosearchdubbonacosconsumer.controller;

import cn.htl.ssosearchdubbonacosconsumer.impl.RemoteIHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IHelloController {
    @Autowired
    private RemoteIHelloService remoteIHelloService;
    @RequestMapping("/hello")
    public String sayHello(){
        return remoteIHelloService.sayHello("Dubbo服务集成Nacos成功了哦！可以做其他事情");

    }

}
