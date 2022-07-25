package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
