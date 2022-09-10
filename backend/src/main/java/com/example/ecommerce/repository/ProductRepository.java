package com.example.ecommerce.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;


public interface ProductRepository extends ReactiveCrudRepository<ProductEntity, UUID> {

}
