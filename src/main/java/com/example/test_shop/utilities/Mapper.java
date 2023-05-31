package com.example.test_shop.utilities;

import com.example.test_shop.dto.ProductDto;
import com.example.test_shop.entities.Product;

public final class Mapper {

    public static <T extends ProductDto> Product map(T product) {
       Product res = new Product();
       res.setManufacture(product.getManufacture());
       res.setQuantity(product.getQuantity());
       res.setSn(product.getSn());
       return res;
    }

}
