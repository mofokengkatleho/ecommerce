package com.example.ecommerce.repository;

import com.example.ecommerce.entity.OrderItemEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID> {
}
