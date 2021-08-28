package com.company.devices;

public class Diesel extends Car {

    public Diesel(String producer, String model, String color, int yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, color, value);
    }
    public void refuel()
    {
        System.out.println("dolej ropy");
    }
}
