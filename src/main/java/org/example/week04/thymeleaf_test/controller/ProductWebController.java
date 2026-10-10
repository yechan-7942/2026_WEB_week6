package org.example.week04.thymeleaf_test.controller;

import org.example.week04.thymeleaf_test.dto.ProductRequest;
import org.example.week04.thymeleaf_test.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductWebController {
    private final ProductService productService;

    public ProductWebController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String list(Model model) {
        model.addAttribute("products", productService.findAll(null));
        return "products/list";
    }

    @GetMapping("/products/new")
    public String form() {
        return "products/form";
    }

    @PostMapping("/products")
    public String create(@ModelAttribute ProductRequest request) {
        productService.create(request);
        // PRG: 등록 후 redirect하여 새로고침 시 중복 등록 방지
        return "redirect:/products";
    }
}


