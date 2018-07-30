package com.rentalCompany.Dao.interfaces;

import org.springframework.stereotype.Component;
import com.rentalCompany.Model.Car;

import java.util.ArrayList;


@Component
public interface CarDao {

    public void save(Car car);

    public Car update(Car car);

    public void delete (Car car);

    public ArrayList<Car> getCars ();

}
