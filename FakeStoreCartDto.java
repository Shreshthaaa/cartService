package com.example.cartService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCartDto {
    Long id;
    Long userId;
    String date;
    String products;
}
