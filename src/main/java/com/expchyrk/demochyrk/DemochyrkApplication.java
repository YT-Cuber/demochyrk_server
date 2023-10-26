package com.expchyrk.demochyrk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemochyrkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemochyrkApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/hello/world")
	public String world(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Bye %s!", name);
	}
	@GetMapping("/hi/vodim")
	public String vodim(@RequestParam(value = "name", defaultValue = "Nigga") String name) {
		return String.format("Vodim, cho ti zabil %s!", name);
	}

}
