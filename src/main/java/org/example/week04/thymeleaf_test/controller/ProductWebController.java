package org.example.week04.thymeleaf_test.controller;

import org.example.week04.thymeleaf_test.service.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductWebController {
    private final ProductService productService;

    public ProductWebController(ProductService productService) {
        this.productService = productService;
    }
}
