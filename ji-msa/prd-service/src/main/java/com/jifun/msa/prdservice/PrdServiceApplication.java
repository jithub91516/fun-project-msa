package com.jifun.msa.prdservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jifun")
public class PrdServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrdServiceApplication.class, args);
	}

}
