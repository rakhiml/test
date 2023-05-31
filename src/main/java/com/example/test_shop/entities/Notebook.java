package com.example.test_shop.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Notebook extends Product{
    public Notebook(Product product, Integer size) {
        super(product.getSn(), product.getManufacture(), product.getQuantity());
        this.size = size;
    }
    @NotNull
    private Integer size;
}
