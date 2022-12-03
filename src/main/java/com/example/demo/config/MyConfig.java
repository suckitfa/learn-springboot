package com.example.demo.config;

import com.example.demo.bean.Pet;
import com.example.demo.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.Permission;

@Configuration // 该注解告诉SpringBoot这是一个配置类，相当于以前的配置文件
public class MyConfig {
    @Bean // 给容器中添加组件，以方法名作为组件的id，返回类型就是组件类型
    public User user01() {
        return new User("zhangsan",10);
    }

    @Bean("Alice") // 自动以容器名字叫做alice
    public Pet pet01() {
        return new Pet("Alice");
    }
}
