package com.tommy.coding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "resource_type")
public class Resource {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private int size;
    private String url;

    @OneToOne()
    @JoinColumn(
            name = "lecture_id"
    )
    private Lecture lecture;
}
