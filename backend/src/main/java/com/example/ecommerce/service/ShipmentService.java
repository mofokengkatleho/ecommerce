package com.example.ecommerce.service;
import com.example.ecommerce.entity.ShipmentEntity;

import javax.validation.constraints.Min;


public interface ShipmentService {
  public Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.")  String id);
}
