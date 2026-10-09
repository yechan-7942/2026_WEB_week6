package org.example.week04.thymeleaf_test.dto;

import org.example.week04.thymeleaf_test.domain.Product;

public record ProductResponse(String id, String name, String category, String count, int price, int day) {

    public static ProductResponse from(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getCategory(),
                product.getCount(),
                product.getPrice(),
                product.getDay()
        );
    }
}
