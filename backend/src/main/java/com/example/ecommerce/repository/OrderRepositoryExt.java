package com.example.ecommerce.repository;

import com.example.ecommerce.entity.OrderEntity;
import com.example.ecommerce.model.NewOrder;
import reactor.core.publisher.Mono;


public interface OrderRepositoryExt {

  Mono<OrderEntity> insert(Mono<NewOrder> m);

  Mono<OrderEntity> updateMapping(OrderEntity orderEntity);
}

