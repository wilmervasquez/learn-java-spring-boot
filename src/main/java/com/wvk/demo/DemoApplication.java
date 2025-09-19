package com.wvk.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication(scanBasePackages = "com.wvk.demo.controller")
public class DemoApplication {
  private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {

    logger.info("Learning Spring Boot Application");
    logger.error("Application Error");
		SpringApplication.run(DemoApplication.class, args);
	}
}
