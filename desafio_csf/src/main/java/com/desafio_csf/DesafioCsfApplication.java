package com.desafio_csf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Desafio CSF", version = "1.0", description = "Desafio para vaga de Engenheiro Java"))
public class DesafioCsfApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioCsfApplication.class, args);
	}
}
