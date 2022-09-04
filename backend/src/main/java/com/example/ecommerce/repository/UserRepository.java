package com.example.ecommerce.repository;

import com.example.ecommerce.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface UserRepository extends CrudRepository<UserEntity, UUID> {
}

