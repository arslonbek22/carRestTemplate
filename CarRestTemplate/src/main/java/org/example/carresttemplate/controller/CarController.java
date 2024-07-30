package org.example.carresttemplate.controller;

import lombok.RequiredArgsConstructor;
import org.example.carresttemplate.entity.Car;
import org.example.carresttemplate.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {


    private  final  CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping
    public Car saveCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable String id) {
        return carService.getCarById(id);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable String  id, @RequestBody Car car) {
        return carService.editeCar(id, car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }
}
