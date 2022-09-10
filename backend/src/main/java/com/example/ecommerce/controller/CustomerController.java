package com.example.ecommerce.controller;


import com.example.ecommerce.CustomerApi;
import com.example.ecommerce.exception.ResourceNotFoundException;
import com.example.ecommerce.hateoas.AddressRepresentationModelAssembler;
import com.example.ecommerce.hateoas.CardRepresentationModelAssembler;
import com.example.ecommerce.hateoas.UserRepresentationModelAssembler;
import com.example.ecommerce.model.Card;
import com.example.ecommerce.model.User;
import com.example.ecommerce.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.*;

@RestController
public class CustomerController implements CustomerApi {

  private final UserRepresentationModelAssembler assembler;
  private final AddressRepresentationModelAssembler addrAssembler;
  private final CardRepresentationModelAssembler cardAssembler;
  private UserService service;

  public CustomerController(UserService service, UserRepresentationModelAssembler assembler,
      AddressRepresentationModelAssembler addrAssembler,
      CardRepresentationModelAssembler cardAssembler) {
    this.service = service;
    this.assembler = assembler;
    this.addrAssembler = addrAssembler;
    this.cardAssembler = cardAssembler;
  }

  @Override
  public Mono<ResponseEntity<Void>> deleteCustomerById(String id, ServerWebExchange exchange) {
    return service.getCustomerById(id)
        .flatMap(c -> service.deleteCustomerById(c.getId())
            .then(Mono.just(status(HttpStatus.ACCEPTED).<Void>build())))
        .switchIfEmpty(Mono.just(notFound().build()));
  }

  @Override
  public Mono<ResponseEntity<Flux<Address>>> getAddressesByCustomerId(String id,
      ServerWebExchange exchange) {

    return Mono.just(ok(service.getAddressesByCustomerId(id)
        .map(c -> addrAssembler.entityToModel(c, exchange))
        .switchIfEmpty(
            Mono.error(new ResourceNotFoundException("No address found for given customer")))));
  }

  @Override
  public Mono<ResponseEntity<Flux<User>>> getAllCustomers(ServerWebExchange exchange) {
    return Mono.just(ok(assembler.toListModel(service.getAllCustomers(), exchange)));
  }

  @Override
  public Mono<ResponseEntity<Card>> getCardByCustomerId(String id, ServerWebExchange exchange) {
    return service.getCardByCustomerId(id).map(c -> cardAssembler.entityToModel(c, exchange))
        .map(ResponseEntity::ok)
        .defaultIfEmpty(notFound().build());
  }

  @Override
  public Mono<ResponseEntity<User>> getCustomerById(String id, ServerWebExchange exchange) {
    return service.getCustomerById(id).map(c -> assembler.entityToModel(c, exchange))
        .map(ResponseEntity::ok)
        .defaultIfEmpty(notFound().build());
  }
}
