package com.rentalCompany.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public abstract class AbstractHibernateDao {

    private SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}