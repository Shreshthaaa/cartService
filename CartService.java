package com.example.cartService.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.cartService.dto.FakeStoreCartDto;

@Service
public class CartService {
    
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    // public FakeStoreCartDto getCartbyId(Long id){
    //     var response = restTemplate.getForObject(url+"/carts/"+id, FakeStoreCartDto.class);
    //     return response;
    // }
    public FakeStoreCartDto getCartbyId(Long id){
        var response = restTemplate.getForObject(url+"/carts/"+id, FakeStoreCartDto.class);
        return response;
        // return "Product from service with id: " + id;
    }

}
