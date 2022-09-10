package com.example.ecommerce.service;


import com.example.ecommerce.entity.AddressEntity;
import com.example.ecommerce.entity.CardEntity;
import com.example.ecommerce.entity.UserEntity;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {

  private UserRepository repository;

  public UserServiceImpl(UserRepository repository) {
    this.repository = repository;
  }

  @Override
  public void deleteCustomerById(String id) {
    repository.deleteById(UUID.fromString(id));
  }

  @Override
  public Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id) {
    return repository.findById(UUID.fromString(id)).map(UserEntity::getAddresses);
  }

  @Override
  public Iterable<UserEntity> getAllCustomers() {
    return repository.findAll();
  }

  @Override
  public Optional<CardEntity> getCardByCustomerId(String id) {
    return Optional.of(repository.findById(UUID.fromString(id)).map(UserEntity::getCard).get().get(0));
  }

  @Override
  public Optional<UserEntity> getCustomerById(String id) {
    return repository.findById(UUID.fromString(id));
  }
}
