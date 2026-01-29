package com.academique.module_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient // Permet à ModuleService de s'enregistrer sur Eureka
public class ModuleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleServiceApplication.class, args);
	}

}
