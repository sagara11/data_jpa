package com.tommy.coding.jpa.repositories;

import com.tommy.coding.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository  extends JpaRepository<Author, Integer> {
    List<Author> findAllByFirstNameStartsWith(String fn);
}
