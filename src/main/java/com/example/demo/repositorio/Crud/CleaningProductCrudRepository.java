package com.example.demo.repositorio.Crud;

import com.example.demo.modelo.CleaningProduct;
import com.example.demo.modelo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CleaningProductCrudRepository extends MongoRepository<CleaningProduct, Integer> {






}
