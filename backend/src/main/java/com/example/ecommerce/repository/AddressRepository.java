package com.example.ecommerce.repository;


import com.example.ecommerce.entity.AddressEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;


public interface AddressRepository extends ReactiveCrudRepository<AddressEntity, UUID> {
}

