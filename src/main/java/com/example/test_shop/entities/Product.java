package com.example.test_shop.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;
    private String sn;
    private String manufacture;
    private String quantity;

    public Product(String sn, String manufacture, String quantity) {
        this.sn = sn;
        this.manufacture = manufacture;
        this.quantity = quantity;
    }
}
