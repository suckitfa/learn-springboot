package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.Car;
@Slf4j
@RestController
public class HelloController {

    //这个Autowired是个啥
    @Autowired
    Car car;
    @RequestMapping("/hello")
    public String index(@RequestParam("name") String name) {
        log.info("request coming!");
        return "hello " + name;
    }

    @RequestMapping("/car")
    public  Car car() {return car;}

}
