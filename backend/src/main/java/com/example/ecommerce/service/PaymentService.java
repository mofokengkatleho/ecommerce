package com.example.ecommerce.service;


import com.example.ecommerce.entity.AuthorizationEntity;
import com.example.ecommerce.model.PaymentReq;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


public interface PaymentService {

  Mono<AuthorizationEntity> authorize(@Valid Mono<PaymentReq> paymentReq);
  Mono<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId);
}
