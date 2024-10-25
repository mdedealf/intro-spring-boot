package com.mdedealf.exerciseOne.products.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private  int id;
    private  String name;
    private  String category;
    private  double price;

}
