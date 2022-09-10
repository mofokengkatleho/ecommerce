package com.example.ecommerce.service;

import com.example.ecommerce.entity.AddressEntity;
import com.example.ecommerce.model.AddAddressReq;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;


public interface AddressService {
  Mono<AddressEntity> createAddress(Mono<AddAddressReq> addAddressReq);
  Mono<Void> deleteAddressesById(String id);
  Mono<Void> deleteAddressesById(UUID id);
  Mono<AddressEntity> getAddressesById(String id);
  Flux<AddressEntity> getAllAddresses();
}
