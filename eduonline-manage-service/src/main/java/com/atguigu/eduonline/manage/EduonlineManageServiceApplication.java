package com.atguigu.eduonline.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.eduonline")
@MapperScan(basePackages = "com.atguigu.eduonline.manage.mapper")
public class EduonlineManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduonlineManageServiceApplication.class, args);
	}
}
