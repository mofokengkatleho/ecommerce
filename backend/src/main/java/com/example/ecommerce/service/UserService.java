package com.example.ecommerce.service;


import com.example.ecommerce.entity.AddressEntity;
import com.example.ecommerce.entity.CardEntity;
import com.example.ecommerce.entity.UserEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;


public interface UserService {
  Mono<Void> deleteCustomerById(String id);
  Mono<Void> deleteCustomerById(UUID id);
  Flux<AddressEntity> getAddressesByCustomerId(String id);
  Flux<UserEntity> getAllCustomers();
  Mono<CardEntity> getCardByCustomerId(String id);
  Mono<UserEntity> getCustomerById(String id);
}
