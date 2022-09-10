package com.example.ecommerce.service;


import com.example.ecommerce.entity.AddressEntity;
import com.example.ecommerce.entity.CardEntity;
import com.example.ecommerce.entity.UserEntity;

import java.util.Optional;


public interface UserService {
  public void deleteCustomerById(String id);
  public Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id);
  public Iterable<UserEntity> getAllCustomers();
  public Optional<CardEntity> getCardByCustomerId(String id);
  public Optional<UserEntity> getCustomerById(String id);
}
