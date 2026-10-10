package org.example.week04.thymeleaf_test.dto;

import org.example.week04.thymeleaf_test.domain.Product;

import java.time.LocalDate;

public record ProductResponse(Long id, String name, String category, int quantity, int price, LocalDate expirationDate) {

    public static ProductResponse from(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getCategory(),
                product.getQuantity(),
                product.getPrice(),
                product.getExpirationDate()
        );
    }
}
