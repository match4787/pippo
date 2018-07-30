package com.rentalCompany.Controller;

import com.rentalCompany.Controller.Interfaces.RentalController;
import com.rentalCompany.Model.Car;
import com.rentalCompany.Service.interfaces.RentalService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class RentalControllerImpl implements RentalController {


    RentalService rentalService;

    @RequestMapping("/addCar")
    public void addCar(@ModelAttribute("Car") Car car) {
        {
            rentalService.addCar(car);
//            return ResponseEntity
        }

    }

}
