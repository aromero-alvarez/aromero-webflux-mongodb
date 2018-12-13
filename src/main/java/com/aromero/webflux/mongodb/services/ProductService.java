package com.aromero.webflux.mongodb.services;

import com.aromero.webflux.mongodb.domains.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    Flux<Product> getAllProducts();
    Mono<Product> createProduct(Product product);
    Mono<Product> getProductById(String id);
}
