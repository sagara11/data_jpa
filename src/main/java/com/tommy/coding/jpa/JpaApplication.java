package com.tommy.coding.jpa;

import com.tommy.coding.jpa.models.Video;
import com.tommy.coding.jpa.repositories.AuthorRepository;
import com.tommy.coding.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
			var video = Video.builder()
					.name("Tommy")
					.length(100)
					.build();
			videoRepository.save(video);
		};
	}
}
