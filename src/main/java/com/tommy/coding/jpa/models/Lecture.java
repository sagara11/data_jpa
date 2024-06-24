package com.tommy.coding.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Lecture {
    public Lecture() {
    }

    public Lecture(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
