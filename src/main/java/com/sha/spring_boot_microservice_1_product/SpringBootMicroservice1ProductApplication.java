package com.sha.spring_boot_microservice_1_product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringBootMicroservice1ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice1ProductApplication.class, args);
	}

}
