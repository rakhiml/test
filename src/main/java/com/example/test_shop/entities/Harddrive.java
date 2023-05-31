package com.example.test_shop.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Harddrive extends Product {
    public Harddrive(Product product, Integer size) {
        super(product.getSn(), product.getManufacture(), product.getQuantity());
        this.size = size;
    }

    private Integer size;
}
