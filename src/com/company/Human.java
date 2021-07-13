package com.company;
import java.util.Date;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import java.util.Arrays;
import java.util.Date;
import java.util.*;

public class Human {


    public Phone phone;
    String firstName;
    String lastName;
    Animal pet;

    private String pesel;
    public Double cash = 0.0;
    public Car[] garage;
    public Double salary;
    public Car car;


    public Human()
    {
        garage = new Car[2];
    }

    public String toString(){
        return "firstName: "+firstName+"lastName:  "+lastName+"pet:"+pet+" car: "+car+"salary:  "+salary+"pesel:"+pesel;
    }



    public String getPesel() {

        return pesel;
    }

    public void setPesel(String pesel) {

        this.pesel = pesel;
    }

    public Car getCar(int parking)
    {
        return this.car;
    }

    public double getGarageValue()
    {
        double value1 = 0;

        for(int i = 0; i< garage.length; i++){

            value1 += garage[i].value;

        }

        return value1;
    }

    public void sortCars()
    {
        Double[] cars = new Double []{ garage[0].value, garage[1].value, garage[2].value};
        Car[] tempCars = new Car[]{};

        Arrays.sort(cars);

        for(int i = 0; i< garage.length; i++){

            if (garage[i].value == cars[0])
            {
                tempCars[0] = garage[i];
            }
            if (garage[i].value == cars[1])
            {
                tempCars[1] = garage[i];
            }
            if (garage[i].value == cars[2])
            {
                tempCars[2] = garage[i];
            }

        }
    }


    public void setCar(Car newCar, int parking) {
        if (salary > newCar.value) {
            System.out.println("Samochód udało się kupić za gotówkę");
            this.car = newCar;
        } else if (salary > newCar.value / 12) {
            System.out.println("Udało się kupić na kredyt (no trudno)");
            this.car = newCar;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }


    }
}
