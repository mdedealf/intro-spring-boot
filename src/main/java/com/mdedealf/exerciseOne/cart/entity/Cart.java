package com.mdedealf.exerciseOne.cart.entity;

import com.mdedealf.exerciseOne.products.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private int id;
    private List<Product> products;
}
