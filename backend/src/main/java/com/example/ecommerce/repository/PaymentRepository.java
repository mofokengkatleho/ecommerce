package com.example.ecommerce.repository;

import com.example.ecommerce.entity.PaymentEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;


public interface PaymentRepository extends ReactiveCrudRepository<PaymentEntity, UUID> {

}

