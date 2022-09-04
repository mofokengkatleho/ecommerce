package com.example.ecommerce.repository;

import com.example.ecommerce.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}

