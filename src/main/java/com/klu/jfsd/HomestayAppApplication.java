package com.klu.jfsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class HomestayAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomestayAppApplication.class, args);
		System.out.println("Welcome to Homestay");
	}

}
