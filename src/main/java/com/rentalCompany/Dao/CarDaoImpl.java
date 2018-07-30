package com.rentalCompany.Dao;

import com.rentalCompany.Dao.interfaces.CarDao;
import com.rentalCompany.Model.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;



@Component
@Repository
public class CarDaoImpl extends AbstractHibernateDao  implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Transactional

    public void save(Car car) {
        Session session = sessionFactory.getCurrentSession();
        session.save(car);
    }

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public void delete(Car car) {

    }

    @Override
    public ArrayList<Car> getCars() {
        return null;
    }
}
