package com.tommy.coding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Course extends BaseEntity {
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
    private String title;
    private String description;
}

