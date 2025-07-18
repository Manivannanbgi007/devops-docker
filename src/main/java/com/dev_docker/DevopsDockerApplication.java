package com.dev_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DevopsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDockerApplication.class, args);
	}
	
	@GetMapping("/docker")
	public String testApi() {
		return "test api with docker";
	}

}
