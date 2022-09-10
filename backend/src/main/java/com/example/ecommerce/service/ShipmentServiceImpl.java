package com.example.ecommerce.service;


import com.example.ecommerce.entity.ShipmentEntity;
import com.example.ecommerce.repository.ShipmentRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import javax.validation.constraints.Min;


@Service
public class ShipmentServiceImpl implements ShipmentService {

  private ShipmentRepository repository;

  public ShipmentServiceImpl(ShipmentRepository repository) {
    this.repository = repository;
  }

  @Override
  public Flux<ShipmentEntity> getShipmentByOrderId(
      @Min(value = 1L, message = "Invalid shipment ID.") String id) {
    return repository.getShipmentByOrderId(id);
  }
}
