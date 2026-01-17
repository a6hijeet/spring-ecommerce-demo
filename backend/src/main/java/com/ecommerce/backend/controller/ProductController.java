package com.ecommerce.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.ecommerce.backend.model.Product;
import com.ecommerce.backend.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

  private ProductService service;

  public ProductController(ProductService service) {
    this.service = service;
  }

  @GetMapping("/products")
  public ResponseEntity<List<Product>> getAllProducts() {
    return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
  }

  @GetMapping("/product/{id}")
  public Product getProductById(@PathVariable int id) {
    return service.getProductById(id);
  }

  @PostMapping("/product")
  public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
    try {
      Product p = service.addProduct(product, imageFile);
      return new ResponseEntity<>(p, HttpStatus.CREATED);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/product/{id}/image")
  public ResponseEntity<byte[]> getImageByProductId(@PathVariable int id) {
    Product product = service.getProductById(id);
    byte[] image = product.getImageData();
    return ResponseEntity.ok().contentType(MediaType.valueOf(product.getImageType())).body(image);
  }

  @PutMapping("/product/{id}")
  public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestPart Product product, @RequestPart MultipartFile imageFile) {
    Product p = service.getProductById(id);
    if (p == null) {
      return new ResponseEntity<>("No product found", HttpStatus.NOT_FOUND);
    }
    try {
      p = service.updateProduct(id, product, imageFile);
      return new ResponseEntity<>("Updated", HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>("Failed to update", HttpStatus.BAD_REQUEST);
    }
  }

  @DeleteMapping("/product/{id}")
  public ResponseEntity<String> deleteProduct(@PathVariable int id) {
    Product product = service.getProductById(id);
    if(product != null) {
      service.deleteProduct(id);
      return new ResponseEntity<>("Deleted", HttpStatus.OK);
    } else {
      return new ResponseEntity<>("No product found", HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/products/search")
  public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword) {
      List<Product> products = service.searchProducts(keyword);
      return new ResponseEntity<>(products, HttpStatus.OK);
  }
  

}
