package com.stone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ApplicationStart{

	//springboot程序启动的入口
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}
}
