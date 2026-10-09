package org.example.week04.thymeleaf_test.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record ProductRequest(
        @NotBlank String name,
        @NotBlank String category,
        @NotBlank String count,
        @PositiveOrZero int price,
        @PositiveOrZero int day
) {
}
