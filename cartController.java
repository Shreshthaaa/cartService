package com.example.cartService.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cartService.dto.FakeStoreCartDto;
import com.example.cartService.service.CartService;

import lombok.experimental.PackagePrivate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class cartController {
    CartService cs;

    cartController(CartService cs){
        this.cs = cs;
    }

    @GetMapping("/carts")
    public String getAllCarts(){
        CartService cs = new CartService();
        return cs.getAllCarts();
    }

    @GetMapping("/carts/{id}/")
    public FakeStoreCartDto getCartById(@PathVariable Long id){
        CartService cs = new CartService();

        return cs.getCartbyId(id);
    }
}
