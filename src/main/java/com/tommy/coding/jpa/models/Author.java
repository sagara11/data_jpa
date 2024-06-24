package com.tommy.coding.jpa.models;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(
            length = 35
    )
    private String firstName;
    private String lastName;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private Integer age;

    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;

    @Column(
            insertable = false
    )
    private LocalDateTime lastModifier;

    @ManyToMany(
            mappedBy = "authors"
    )
    private List<Course> courses;

    public Author() {
    }

    public Author(String firstName, String lastName, String email, Integer age, LocalDateTime lastModifier, LocalDateTime createdAt) {
        this.firstName = firstName;
        this.lastModifier = lastModifier;
        this.createdAt = createdAt;
        this.age = age;
        this.email = email;
        this.lastName = lastName;
    }

    public Author(String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(LocalDateTime lastModifier) {
        this.lastModifier = lastModifier;
    }
}
