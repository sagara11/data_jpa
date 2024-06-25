package com.tommy.coding.jpa.repositories;

import com.tommy.coding.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
