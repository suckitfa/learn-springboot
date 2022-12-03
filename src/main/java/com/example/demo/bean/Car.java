package com.example.demo.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@NoArgsConstructor // 无参构造器
@AllArgsConstructor // 全参构造器
@ToString // 序列化
@Data // lombok简化Java Bean的开发 getters&setters
@Component
@EqualsAndHashCode
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;
}
