package com.gl.helloPCF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloPcfApplication {

	@GetMapping("/hello")
	public String helloPCFWorld(){
		return "!!Hello PCF!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloPcfApplication.class, args);
	}

}
