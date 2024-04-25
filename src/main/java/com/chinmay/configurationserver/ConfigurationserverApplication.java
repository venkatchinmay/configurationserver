package com.chinmay.configurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
// @SpringBootApplication contains 3
// 1. @EnableAutoConfiguration
// 2. @ComponentScan
// 3. @SpringBootConfiguration
@SpringBootApplication
@EnableConfigServer // Spring cloud config service
public class ConfigurationserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationserverApplication.class, args);
	}

}
