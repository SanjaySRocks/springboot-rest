package com.sanjay.simpleWebApp.service;

import com.sanjay.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product>  products = new ArrayList<>(Arrays.asList(
            new Product(101, "Laptop", 50000),
            new Product(102, "Desktop", 35000)
    ));

    public List<Product> getProducts()
    {
        return products;
    }

    public Product getProductById(int prodId)
    {
        return products.stream()
                .filter(p-> prodId == p.getProdId())
                .findFirst().get();
    }

    public void addProduct(Product prod)
    {
        products.add(prod);
    }
}
