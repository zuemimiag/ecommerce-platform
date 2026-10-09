package com.ecom.product.service;

import com.ecom.product.dto.ProductRequest;
import com.ecom.product.dto.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(ProductRequest request);
    Page<ProductResponse> getAllProducts(Pageable pageable);
    ProductResponse getProductById(Long id);

    Page<ProductResponse> getProductsByCategory(String category,Pageable pageable);
    ProductResponse updateProduct(Long id, ProductRequest request);
    void deleteProduct(Long id);
}