package com.example.ecommerce.service;

import com.example.ecommerce.entity.AuthorizationEntity;
import com.example.ecommerce.model.PaymentReq;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;


public interface PaymentService {

  public Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq);
  public Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId);
}
