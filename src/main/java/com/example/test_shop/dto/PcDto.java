package com.example.test_shop.dto;

import com.example.test_shop.entities.enums.FormFactor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PcDto extends ProductDto{
    private FormFactor formFactor;
}
