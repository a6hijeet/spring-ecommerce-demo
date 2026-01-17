package com.ecommerce.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.backend.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
