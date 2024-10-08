package com.sanjay.simpleWebApp.controller;

import com.sanjay.simpleWebApp.model.Product;
import com.sanjay.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product prod)
    {
        service.addProduct(prod);

        return "Product Added!";
    }

    @PutMapping("/products")
    public String updateProduct(@RequestBody Product prod)
    {
        service.updateProduct(prod);
        return "Product Updated!";
    }

    @DeleteMapping("/products/{prodId}")
    public String deleteProduct(@PathVariable int prodId)
    {
        service.deleteProduct(prodId);

        return "Product deleted!";
    }
}
