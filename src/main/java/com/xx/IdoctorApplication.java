package com.xx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.xx.mapper")
//开始定时任务
@EnableScheduling
//开启异步调用方法
@EnableAsync
public class IdoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdoctorApplication.class, args);
	}
}
