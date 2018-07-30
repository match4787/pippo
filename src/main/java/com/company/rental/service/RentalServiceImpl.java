package com.company.rental.service;

import com.company.rental.repository.CarRepository;
import com.company.rental.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Long saveCar(Car car)
    {
        return carRepository.save(car).getId();
    }

    @Override
    public void updateCar(Car car)
    {
        carRepository.save(car);
    }

    @Override
    public void deleteCarById(Long id)
    {
        carRepository.deleteById(id);
    }

    @Override
    public List<Car> getCars()
    {
        return carRepository.findAll();
    }
}
