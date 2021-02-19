package com.babeltime.tryspring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//@RestController 表示json 格式输出，@Controller 内容输出到页面
public class HelloController {

    //@RequestMapping 提供路由信息
    @RequestMapping("/hello")
    public String hello(String name ){
        return name;
    }
}
