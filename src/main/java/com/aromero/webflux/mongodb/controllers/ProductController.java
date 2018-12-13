package com.aromero.webflux.mongodb.controllers;

import com.aromero.webflux.mongodb.domains.Product;
import com.aromero.webflux.mongodb.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Flux<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Mono<Product> getProductById(@PathVariable final String id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public Mono<Product> createProduct(@Valid @RequestBody final Product product) {
        return productService.createProduct(product);
    }

}
