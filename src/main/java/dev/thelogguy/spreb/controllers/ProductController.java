package dev.thelogguy.spreb.controllers;

import dev.thelogguy.spreb.services.ProductService;
import dev.thelogguy.spreb.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getProducts(Model model) {
        var products = this.productService.getProducts();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(@RequestParam String name, @RequestParam double price, Model model) {
        this.productService.addProduct(new Product(name, price));
        var products = this.productService.getProducts();
        model.addAttribute("products", products);
        return "products.html";
    }
}
