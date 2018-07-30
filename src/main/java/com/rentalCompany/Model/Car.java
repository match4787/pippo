package com.rentalCompany.Model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;


@Entity
@Table(name="car")
public class Car implements Serializable {

    private long carId;
    private String brand;
    private String model;
    private String engineType;
    private String colour;
    private int year;


    public Car (String brand, String model, String engineType, String colour, int year){
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.colour = colour;
        this.year = year;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "CAR_ID", unique= true, nullable=false)
    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    @Column(name="BRAND")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Column(name="MODEL")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Column(name="ENGINE_TYPE")
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    @Column(name="COLOUR")
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    @Column(name="YEAR")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
