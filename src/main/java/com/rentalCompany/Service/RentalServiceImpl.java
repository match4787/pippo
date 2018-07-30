package com.rentalCompany.Service;

import com.rentalCompany.Dao.interfaces.CarDao;
import com.rentalCompany.Model.Car;
import com.rentalCompany.Service.interfaces.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service("rentalService")
public class RentalServiceImpl implements RentalService {

    @Autowired
    private CarDao carDao;


    @Override
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    @Transactional
    public void addCar(Car car) {
        this.carDao.save(car);
    }

    @Override
    public void update(Car car) {

        this.carDao.update(car);
    }

    @Override
    public void delete(Car car) {

        this.carDao.delete(car);
    }

    @Override
    public ArrayList<Car> getCars() {
        return this.carDao.getCars();
    }

}
