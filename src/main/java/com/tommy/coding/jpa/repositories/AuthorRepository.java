package com.tommy.coding.jpa.repositories;

import com.tommy.coding.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository  extends JpaRepository<Author, Integer> {

}
