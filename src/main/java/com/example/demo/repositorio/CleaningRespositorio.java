package com.example.demo.repositorio;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.CleaningProduct;
import com.example.demo.modelo.CleaningProduct;
import com.example.demo.repositorio.Crud.CleaningProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Repository;


@Repository
public class CleaningRespositorio {

        @Autowired
        private CleaningProductCrudRepository cleaningProductCrudRepository;

        public List<CleaningProduct> getAll() {
            return cleaningProductCrudRepository.findAll();
        }
        public Optional<CleaningProduct> getCleaningProduct(int id) {
            return cleaningProductCrudRepository.findById(id);
        }
        public CleaningProduct save(CleaningProduct cleaningProduct) {
            return cleaningProductCrudRepository.save(cleaningProduct);
        }

        public void update(CleaningProduct cleaningProduct ) {
            cleaningProductCrudRepository.save(cleaningProduct);
        }

        public void delete(CleaningProduct cleaningProduct) {
            cleaningProductCrudRepository.delete(cleaningProduct);
        }
    }


