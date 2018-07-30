package com.rentalCompany.Service.interfaces;

import com.rentalCompany.Dao.interfaces.CarDao;
import com.rentalCompany.Model.Car;

import java.util.ArrayList;

public interface RentalService {

    public void setCarDao(CarDao carDao);

    public void addCar(Car car);

    public void update(Car car);

    public void delete (Car car);

    public ArrayList<Car> getCars ();
}
