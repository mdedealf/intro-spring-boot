package com.mdedealf.exerciseOne.cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/carts")
public class CartController {

    @GetMapping
    public String getAllCarts() {
        return "Carts data's empty";
    }
}
