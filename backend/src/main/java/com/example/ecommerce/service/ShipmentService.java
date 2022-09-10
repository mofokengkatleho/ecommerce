package com.example.ecommerce.service;

import com.example.ecommerce.entity.ShipmentEntity;
import reactor.core.publisher.Flux;

import javax.validation.constraints.Min;


public interface ShipmentService {
  Flux<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.")  String id);
}
