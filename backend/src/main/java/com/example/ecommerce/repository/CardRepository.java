package com.example.ecommerce.repository;

import com.example.ecommerce.entity.CardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}

