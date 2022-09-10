package com.example.ecommerce.service;


import com.example.ecommerce.entity.CartEntity;
import com.example.ecommerce.entity.ItemEntity;
import com.example.ecommerce.model.Item;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


public interface ItemService {

  Mono<ItemEntity> toEntity(Mono<Item> e);

  Mono<List<Item>> fluxTolList(Flux<ItemEntity> items);

  Flux<Item> toItemFlux(Mono<CartEntity> items);

  ItemEntity toEntity(Item m);

  List<ItemEntity> toEntityList(List<Item> items);

  Item toModel(ItemEntity e);

  List<Item> toModelList(List<ItemEntity> items);

  Flux<Item> toModelFlux(List<ItemEntity> items);
}
