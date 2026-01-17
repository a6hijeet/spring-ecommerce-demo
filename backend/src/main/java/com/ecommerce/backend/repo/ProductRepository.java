package com.ecommerce.backend.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ecommerce.backend.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

  @Query("SELECT p from Product p WHERE " +
  "LOWER(p.name) LIKE CONCAT('%', :keyword, '%') OR " +
  "LOWER(p.description) LIKE CONCAT('%', :keyword, '%') OR " +
  "LOWER(p.brand) LIKE CONCAT('%', :keyword, '%') OR " +
  "LOWER(p.category) LIKE CONCAT('%', :keyword, '%')"
 )
  List<Product> searchProducts(String keyword);
}
