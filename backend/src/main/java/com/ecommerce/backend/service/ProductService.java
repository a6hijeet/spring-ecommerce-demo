package com.ecommerce.backend.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.backend.model.Product;

@Service
public class ProductService {

  List<Product> products = Arrays.asList(
    new Product(101, "Iphone", 1000),
    new Product(102, "Readme", 200),
    new Product(103, "OnePlus", 600)
  );

  public List<Product> getProducts() {
    return products;
  }
}
