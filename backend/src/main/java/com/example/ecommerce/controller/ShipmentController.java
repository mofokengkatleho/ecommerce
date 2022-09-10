package com.example.ecommerce.controller;

import com.example.ecommerce.hateoas.ShipmentRepresentationModelAssembler;
import com.example.ecommerce.model.Shipment;
import com.example.ecommerce.service.ShipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@RestController
public class ShipmentController implements ShipmentApi {

  private final ShipmentRepresentationModelAssembler assembler;
  private ShipmentService service;

  public ShipmentController(ShipmentService service,
      ShipmentRepresentationModelAssembler assembler) {
    this.service = service;
    this.assembler = assembler;
  }

  @Override
  public Mono<ResponseEntity<Flux<Shipment>>> getShipmentByOrderId(@NotNull @Valid String id,
                                                                   ServerWebExchange exchange) {
    return Mono
        .just(ResponseEntity.ok(assembler.toListModel(service.getShipmentByOrderId(id), exchange)));
  }
}
