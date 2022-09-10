package com.example.ecommerce.service;

import com.example.ecommerce.entity.ItemEntity;
import com.example.ecommerce.model.Item;

import java.util.List;


public interface ItemService {

  ItemEntity toEntity(Item m);

  List<ItemEntity> toEntityList(List<Item> items);

  Item toModel(ItemEntity e);

  List<Item> toModelList(List<ItemEntity> items);
}
