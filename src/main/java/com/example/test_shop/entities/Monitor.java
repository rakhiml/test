package com.example.test_shop.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Monitor extends Product{
    public Monitor(Product product, Integer diagonalSize) {
        super(product.getSn(), product.getManufacture(), product.getQuantity());
        this.diagonalSize = diagonalSize;
    }

    private Integer diagonalSize;
}
