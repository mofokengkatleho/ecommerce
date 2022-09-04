package com.example.ecommerce.repository;

import com.example.ecommerce.entity.TagEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;



public interface TagRepository extends CrudRepository<TagEntity, UUID> {
}
