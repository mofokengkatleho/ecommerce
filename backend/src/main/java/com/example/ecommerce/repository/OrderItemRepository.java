package com.example.ecommerce.repository;

import com.example.ecommerce.entity.OrderItemEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;


public interface OrderItemRepository extends ReactiveCrudRepository<OrderItemEntity, UUID> {

}
