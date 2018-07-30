package com.company.rental;

import com.rentalCompany.Model.Car;
import com.rentalCompany.Service.interfaces.RentalService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.rentalCompany.*"})
public class RentalApplication {

	public static void main(String[] args) {

		ApplicationContext appContext =
				new ClassPathXmlApplicationContext("config/BeanLocations.xml");

		SpringApplication.run(RentalApplication.class, args);


//		RentalService rentalService = (RentalService)appContext.getBean("rentalService");

//		Car car = new Car("Ferrari", "F50", "fuel", "red", 1996);
//		rentalService.save(car);
	}
}
