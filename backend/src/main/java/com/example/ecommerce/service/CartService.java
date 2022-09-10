package com.example.ecommerce.service;

import com.example.ecommerce.entity.CartEntity;
import com.example.ecommerce.model.Item;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;


public interface CartService {

  Flux<Item> addCartItemsByCustomerId(CartEntity cartEntity, @Valid Mono<Item> item);

  Flux<Item> addOrReplaceItemsByCustomerId(CartEntity cartEntity, @Valid Mono<Item> newItem);

  Mono<Void> deleteCart(String customerId, String cartId);

  Mono<Void> deleteItemFromCart(CartEntity cartEntity, String itemId);

  Mono<CartEntity> getCartByCustomerId(String customerId);
}
