package com.tommy.coding.jpa;

import com.github.javafaker.Faker;
import com.tommy.coding.jpa.models.Author;
import com.tommy.coding.jpa.models.Video;
import com.tommy.coding.jpa.repositories.AuthorRepository;
import com.tommy.coding.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	){
		return args -> {
//			Faker faker = new Faker();
//			for (int i = 0; i < 50; i++) {
//				var author = Author.builder()
//						.firstName(faker.name().firstName())
//						.lastName(faker.name().lastName())
//						.email("contact" + i + "@gmail.com")
//						.build();

//				authorRepository.save(author);
//			}

			List<Author> authors = authorRepository.findAllByFirstNameStartsWith("P");
			System.out.println(authors);


//			var video = Video.builder()
//					.name("Tommy")
//					.length(100)
//					.build();
//			videoRepository.save(video);
		};
	}
}
