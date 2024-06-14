package com.mhmdd.shop.product.repository;

import com.mhmdd.shop.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
