package com.tommy.coding.jpa.embeded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    private String house_number;
    private String street_name;
    private String zip_code;
}
