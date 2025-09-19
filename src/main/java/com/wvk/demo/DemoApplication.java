package com.wvk.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemoApplication {
  private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {

    logger.info("Te amo");
    logger.error("Aracely");
		SpringApplication.run(DemoApplication.class, args);
	}
}
