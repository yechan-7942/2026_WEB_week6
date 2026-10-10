package org.example.week04.thymeleaf_test.repository;

import org.example.week04.thymeleaf_test.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class MemoryProductRepository implements ProductRepository {
    private final Map<Long, Product> products = new LinkedHashMap<>();
    private final AtomicLong sequence = new AtomicLong();

    @Override
    public Product save(Product product) {
        product.setId(sequence.incrementAndGet());
        products.put(product.getId(), product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(products.get(id));
    }

    @Override
    public Product update(Product product) {
        products.put(product.getId(), product);
        return product;
    }

    @Override
    public void deleteById(Long id) {
        products.remove(id);
    }
}
