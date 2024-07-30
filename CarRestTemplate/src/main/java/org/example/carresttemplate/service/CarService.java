package org.example.carresttemplate.service;

import lombok.RequiredArgsConstructor;
import org.example.carresttemplate.entity.Car;
import org.example.carresttemplate.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public Car getCarById(String id) {
        return carRepository.findById(id).orElse(null);
    }

    public void deleteCar(String id) {
        carRepository.deleteById(id);
    }

    public Car editeCar(String id, Car car) {
        Car car1 = carRepository.findById(id).orElse(null);
        assert car1 != null;
        car1.setName(car.getName());
        return carRepository.save(car1);
    }
}
