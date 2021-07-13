package com.company.devices;

public class Electric extends Car {

    public Electric(String producer, String model, String color, int yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, color, value);
    }
    public void refuel()
    {
        System.out.println("Load battery");
    }
}
