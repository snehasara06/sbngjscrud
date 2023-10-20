package com.kgisl.sbngjscrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class SbngjscrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbngjscrudApplication.class, args);
	}

}
