package com.example.ecommerce.service;


import com.example.ecommerce.entity.AuthorizationEntity;
import com.example.ecommerce.model.PaymentReq;
import com.example.ecommerce.repository.OrderRepository;
import com.example.ecommerce.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;
import java.util.UUID;


@Service
public class PaymentServiceImpl implements PaymentService {

  private PaymentRepository repository;
  private OrderRepository orderRepo;

  public PaymentServiceImpl(PaymentRepository repository, OrderRepository orderRepo) {
    this.repository = repository;
    this.orderRepo = orderRepo;
  }

  @Override
  public Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq) {
    return Optional.empty();
  }

  @Override
  public Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId) {
    return orderRepo.findById(UUID.fromString(orderId)).map(oe -> oe.getAuthorizationEntity());
  }

  /*private AuthorizationEntity toEntity(PaymentReq m) {
    PaymentEntity e = new PaymentEntity();
    e.setAuthorized(true).setMessage()
  }*/
}
