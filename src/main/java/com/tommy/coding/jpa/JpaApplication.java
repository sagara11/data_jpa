package com.tommy.coding.jpa;

import com.tommy.coding.jpa.models.Author;
import com.tommy.coding.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository
	){
		return args -> {
			Author author = new Author(
					"Tommy",
					"Shelby",
					"thiensangkdtt@gmail.com",
					20,
					LocalDateTime.now(),
					LocalDateTime.now()
			);

			authorRepository.save(author);
		};
	}
}
