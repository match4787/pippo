package com.company.rental.service;

import com.company.rental.entity.Car;

import java.util.List;

public interface RentalService {

    Long saveCar(Car car);

    void updateCar(Car car);

    void deleteCarById(Long id);

    List<Car> getCars();

}