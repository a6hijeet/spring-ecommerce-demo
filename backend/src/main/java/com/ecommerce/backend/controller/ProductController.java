package com.ecommerce.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.backend.model.Product;
import com.ecommerce.backend.service.ProductService;

@RestController
public class ProductController {

  @Autowired
  ProductService service;

  @RequestMapping("/products")
  public List<Product> getProducts() {
    return service.getProducts();
  }

  @RequestMapping("/products/{prodId}")
  public Product getProductById(@PathVariable int prodId) {
    return service.getProductById(prodId);

  }
}
