package com.ecommerce.backend.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.backend.model.Product;

@Service
public class ProductService {

  List<Product> products = new ArrayList<>(Arrays.asList(
    new Product(101, "Iphone", 1000),
    new Product(102, "Readme", 200),
    new Product(103, "OnePlus", 600)
  ));

  public List<Product> getProducts() {
    return products;
  }

  public Product getProductById(int id) {
    return products.stream()
                    .filter(product -> product.getProdId() == id)
                    .findFirst().orElse(new Product());
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void updateProduct(Product product) {
    try {
      Product prod = products.stream()
                            .filter(p -> p.getProdId() == product.getProdId())
                            .findFirst()
                            .orElseThrow(() ->new RuntimeException("No product found"));

      int index = products.indexOf(prod);
      products.set(index, product);

    }catch(Exception e) {
      System.out.println("No product found");
    }
    
   
  }
}
