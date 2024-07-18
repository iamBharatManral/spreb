package dev.thelogguy.spreb;

import dev.thelogguy.spreb.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    private ArrayList<Product> products = new ArrayList<>();
    public ArrayList<Product> getProducts() {
        return this.products;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
}
