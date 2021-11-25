package com.amsidh.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@Slf4j
public class DemoSluethJsonLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSluethJsonLogApplication.class, args);
	}

	@GetMapping("/sayHello")
	public String sayHello() {
		log.info("Logging INFO Log");
		log.debug("Logging DEBUG Log");
		log.error("Logging ERROR Log");
		log.warn("Logging WARN Log");
		log.trace("Logging TRACE Log");
		return "Hello World";
	}
}
