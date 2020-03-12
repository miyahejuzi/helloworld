package cn.orange.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kz
 * @date 2019/8/23
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello " + (name == null ? "world" : name);
    }
}
