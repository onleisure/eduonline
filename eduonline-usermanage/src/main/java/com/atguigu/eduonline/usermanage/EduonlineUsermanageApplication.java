package com.atguigu.eduonline.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.eduonline.usermanage.mapper")
@ComponentScan(basePackages = "com.atguigu.eduonline")
public class EduonlineUsermanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduonlineUsermanageApplication.class, args);
	}
}
