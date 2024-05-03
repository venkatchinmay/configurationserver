package com.chinmay.configurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.environment.vault.SpringVaultClientConfiguration;
import org.springframework.cloud.vault.config.VaultAutoConfiguration;
import org.springframework.context.annotation.Import;

// @SpringBootApplication contains 3
// 1. @EnableAutoConfiguration
// 2. @ComponentScan
// 3. @SpringBootConfiguration
@SpringBootApplication(exclude = {VaultAutoConfiguration.class})
@EnableConfigServer // Spring cloud config service
@Import({SpringVaultClientConfiguration.class})
public class ConfigurationserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigurationserverApplication.class, args);
	}

}
