package com.naphat.firstLearnSpring;

import com.naphat.firstLearnSpring.entity.Person;
import com.naphat.firstLearnSpring.repository.PersonDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FirstLearnSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstLearnSpringApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(PersonDAO dao) {
		return runner -> {

		};
	}

}
