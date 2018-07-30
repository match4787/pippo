package com.company.rental.controller;

import com.company.rental.entity.Car;
import com.company.rental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class RentalController
{

    @Autowired
    RentalService rentalService;

    @PostMapping
    public Long saveCar(@RequestBody Car car) {
            return rentalService.saveCar(car);
    }

    @GetMapping
    public List<Car> getCars() {
        return rentalService.getCars();
    }

}
