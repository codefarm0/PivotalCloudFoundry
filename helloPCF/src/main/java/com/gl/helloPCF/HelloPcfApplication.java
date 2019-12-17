package com.gl.helloPCF;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class HelloPcfApplication {

	private Logger logger = LoggerFactory.getLogger(HelloPcfApplication.class);

	private String openTag = "<h2 align = center> <font color=green>";
	private String closeTag = "</font></h2>";
	@GetMapping("/hello")
	public String helloPCFWorld(){
		logger.info("Got hit on /hello");
		return openTag + "!!Hello PCF!! " + closeTag;
	}

	@GetMapping("/ipAddress")
	public String getIpAddress() throws UnknownHostException {
		logger.info("Got hit on /ipAddress");
		String host = InetAddress.getLocalHost().getHostAddress();
		return openTag + "I am running on machine - "  + host + closeTag;
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloPcfApplication.class, args);
	}

}
