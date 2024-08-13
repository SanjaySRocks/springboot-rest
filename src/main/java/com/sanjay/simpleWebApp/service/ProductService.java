package com.sanjay.simpleWebApp.service;

import com.sanjay.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product>  products = Arrays.asList(
            new Product(101, "Laptop", 50000),
            new Product(102, "Desktop", 35000)
    );

    public List<Product> getProducts()
    {
        return products;
    }
}
