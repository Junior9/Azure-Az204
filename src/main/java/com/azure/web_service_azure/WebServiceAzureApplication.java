package com.azure.web_service_azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebServiceAzureApplication {

	@GetMapping("/home")
	public ResponseEntity<String> home(){

		return ResponseEntity.ok("SpringBoot run in Azure");
	}

	public static void main(String[] args) {
		SpringApplication.run(WebServiceAzureApplication.class, args);
	}

}
