package org.example.carresttemplate.repo;

import org.example.carresttemplate.entity.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {

}
