package com.example.ecommerce.service;



import com.example.ecommerce.entity.AddressEntity;
import com.example.ecommerce.model.AddAddressReq;

import java.util.Optional;


public interface AddressService {
  public Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);
  public void deleteAddressesById(String id);
  public Optional<AddressEntity> getAddressesById(String id);
  public Iterable<AddressEntity> getAllAddresses();
}
