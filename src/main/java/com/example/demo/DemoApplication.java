package com.example.demo;

import com.example.demo.bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//告诉注解这是一个SpringBoot应用
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// 返回所有的IOC容器
//		ConfigurableApplicationContext run =  SpringApplication.run(DemoApplication.class, args);
//
//		// 查看组件名字
//		String [] names = run.getBeanDefinitionNames();
//		for(String name :names) {
//			System.out.println(name);
//		}
//		System.out.println(names.length);
//
//		// 从容器中获取组件
//		Pet alice = run.getBean("Alice",Pet.class);
//		Pet alice01 = run.getBean("Alice", Pet.class);
//		// 看下是否单实例的组件
//		System.out.println("组件 =  "+ (alice01 == alice));
	}

}
