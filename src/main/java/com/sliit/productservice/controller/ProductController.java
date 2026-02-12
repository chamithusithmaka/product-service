package com.sliit.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sliit.productservice.model.Product;
import com.sliit.productservice.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {

    @Autowired
    private ProductRepository repository;

    //create
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    //read get all
    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    //read get by id
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    //delete
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        repository.deleteById(id);
    }
    
}
