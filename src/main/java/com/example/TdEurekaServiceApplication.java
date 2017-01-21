package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//服务注册中心
@EnableEurekaServer
@SpringBootApplication
public class TdEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdEurekaServiceApplication.class, args);
	}
}
