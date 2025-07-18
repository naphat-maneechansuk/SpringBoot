package com.naphat.firstLearnSpring;

import com.naphat.firstLearnSpring.entity.Person;
import com.naphat.firstLearnSpring.repository.PersonDAO;
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
	public CommandLineRunner commandLineRunner(PersonDAO dao) {
		return runner -> {
			getData(dao);
		};
	}
	public void saveData(PersonDAO dao){
		Person obj1 = new Person("ton", "napat", 20);
		dao.savePerson(obj1);
		System.out.println("Inserted Complete");
	}

	public void deleteData(PersonDAO dao){
		int id = 8;
		dao.deletePerson(id);
		System.out.println("Deleted Complete");
	}

	public void getData(PersonDAO dao){
		int id = 1;
		Person person = dao.getPerson(id);
		System.out.println(person);
	}
}
