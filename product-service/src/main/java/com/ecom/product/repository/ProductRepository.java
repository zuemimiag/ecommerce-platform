package com.ecom.product.repository;

import com.ecom.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Paginated version
    Page<Product> findByCategoryIgnoreCase(String category, Pageable pageable);

    // Optional: Keep the non-paginated version if other parts of your code still need plain Lists
    List<Product> findByCategoryIgnoreCase(String category);
}