package com.example.demo.repositorio.Crud;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
}
