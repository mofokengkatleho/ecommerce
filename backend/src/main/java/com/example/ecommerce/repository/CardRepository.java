package com.example.ecommerce.repository;

import com.example.ecommerce.entity.CardEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;


public interface CardRepository extends ReactiveCrudRepository<CardEntity, UUID> {

}

