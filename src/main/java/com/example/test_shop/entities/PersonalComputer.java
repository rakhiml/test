package com.example.test_shop.entities;

import com.example.test_shop.entities.enums.FormFactor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PersonalComputer extends Product {
    public PersonalComputer(Product product, FormFactor formFactor) {
        super(product.getSn(), product.getManufacture(), product.getQuantity());
        this.formFactor = formFactor;
    }

    @Enumerated(EnumType.STRING)
    private FormFactor formFactor;


}
