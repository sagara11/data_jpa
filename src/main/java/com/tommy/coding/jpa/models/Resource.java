package com.tommy.coding.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Resource {
    public Resource() {
    }

    public Resource(String name, int size, String url) {
        this.name = name;
        this.size = size;
        this.url = url;
    }

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
