package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//告诉注解这是一个SpringBoot应用
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 返回所有的IOC容器
		ConfigurableApplicationContext run =  SpringApplication.run(DemoApplication.class, args);

		// 查看组件名字
		String [] names = run.getBeanDefinitionNames();
		for(String name :names) {
			System.out.println(name);
		}
		System.out.println(names.length);
	}

}
