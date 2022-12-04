package com.example.demo.config;

import com.example.demo.bean.Pet;
import com.example.demo.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.Permission;

/**
 * 1. 配置类的作用是使用@Bean标注方法上给容器注册组件
 * 2. 配置类本身也是组件
 * 3. 代理bean的方法: @Configuration(proxyBeanMethods=true), 保持组件单实例， 如果为false则,非单实例
 *  Full
 *  Lite： 轻量级模式
 *  用来解决组件依赖场景
 */
// 该注解告诉SpringBoot这是一个配置类，相当于以前的配置文件
@Configuration
public class MyConfig {
    @Bean // 给容器中添加组件，以方法名作为组件的id，返回类型就是组件类型
    public User user01() {
        return new User("zhangsan",10);
    }

    @Bean("Alice") // 自动以容器名字叫做alice
    public Pet pet01() {
        return new Pet("Alice",13.11);
    }
}
