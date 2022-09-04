package com.example.ecommerce.service;

import com.example.ecommerce.entity.CardEntity;
import com.example.ecommerce.model.AddCardReq;

import javax.validation.Valid;
import java.util.Optional;


public interface CardService {
  public void deleteCardById(String id);
  public Iterable<CardEntity> getAllCards();
  public Optional<CardEntity> getCardById(String id);
  public Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq);
}
