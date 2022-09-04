package com.example.ecommerce.repository;

import com.example.ecommerce.entity.AuthorizationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface AuthorizationRepository extends CrudRepository<AuthorizationEntity, UUID> {
}

