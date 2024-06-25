package com.tommy.coding.jpa.embeded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_order")
public class Order {
    @EmbeddedId
    private OrderId id;

    @Embedded
    private Address address;

    private String orderInfo;
    private String client;
}
