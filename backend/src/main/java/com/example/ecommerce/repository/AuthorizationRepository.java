package com.example.ecommerce.repository;


import com.example.ecommerce.entity.AuthorizationEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;


public interface AuthorizationRepository extends ReactiveCrudRepository<AuthorizationEntity, UUID> {
}

