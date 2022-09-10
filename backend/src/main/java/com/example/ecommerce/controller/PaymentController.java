package com.example.ecommerce.controller;


import com.example.ecommerce.PaymentApi;
import com.example.ecommerce.hateoas.PaymentRepresentationModelAssembler;
import com.example.ecommerce.model.Authorization;
import com.example.ecommerce.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@RestController
public class PaymentController implements PaymentApi {

  private PaymentService service;
  private final PaymentRepresentationModelAssembler assembler;

  public PaymentController(PaymentService service, PaymentRepresentationModelAssembler assembler) {
    this.service = service;
    this.assembler = assembler;
  }

  @Override
  public Mono<ResponseEntity<Authorization>> authorize(@Valid Mono<PaymentReq> paymentReq, ServerWebExchange exchange) {
    return null;
  }

  @Override
  public Mono<ResponseEntity<Authorization>> getOrdersPaymentAuthorization(
      @NotNull @Valid String id, ServerWebExchange exchange) {
    return null;
  }
}
