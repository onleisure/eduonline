package com.atguigu.eduonline.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.eduonline")
public class EduonlineManageWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduonlineManageWebApplication.class, args);
	}
}
