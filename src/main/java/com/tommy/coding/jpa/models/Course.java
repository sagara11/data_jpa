package com.tommy.coding.jpa.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Course {
    public Course() {
    }

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @ManyToMany
    @JoinTable(
            name = "courses_authors",
           joinColumns = {
                    @JoinColumn(name = "course_id")
           },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;

    @OneToMany(
            mappedBy = "course"
    )
    private List<Section> sections;

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

