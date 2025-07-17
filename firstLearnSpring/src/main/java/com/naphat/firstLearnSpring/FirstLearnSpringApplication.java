package com.naphat.firstLearnSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstLearnSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstLearnSpringApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner->{
			System.out.println("Hello i na luck");
		};
	}
}
