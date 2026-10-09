package org.example.week04.thymeleaf_test.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.time.LocalDate;

public record ProductRequest(
        @NotBlank String name,
        @NotBlank String category,
        @PositiveOrZero int quantity,
        @PositiveOrZero int price,
        @NotNull LocalDate expirationDate
) {
}
