package org.example.week04.thymeleaf_test.repository;

import org.example.week04.thymeleaf_test.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Product save(Product product);
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product update(Product product);
    void deleteById(Long id);
}
