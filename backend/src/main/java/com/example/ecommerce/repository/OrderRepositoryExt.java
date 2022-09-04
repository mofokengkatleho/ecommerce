package com.example.ecommerce.repository;


import com.example.ecommerce.entity.OrderEntity;
import com.example.ecommerce.model.NewOrder;

import java.util.Optional;

public interface OrderRepositoryExt {
  Optional<OrderEntity> insert(NewOrder m);
}

