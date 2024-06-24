package com.tommy.coding.jpa.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Section {
    public Section() {
    }

    public Section(String name, int sectionOrder) {
        this.name = name;
        this.sectionOrder = sectionOrder;
    }

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int sectionOrder;

    @ManyToOne
    @JoinColumn(
            name = "course_id"
    )
    private Course course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(int sectionOrder) {
        this.sectionOrder = sectionOrder;
    }
}
