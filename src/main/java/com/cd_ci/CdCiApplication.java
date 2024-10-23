package com.cd_ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CdCiApplication {
	@GetMapping("/bienvenidos")
	public String bienvenido(){
		return "Bienvenidos";
	}
	public static void main(String[] args) {
		SpringApplication.run(CdCiApplication.class, args);
	}

}
