package com.mdedealf.exerciseOne.cart.model;

import com.mdedealf.exerciseOne.products.model.Product;
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
