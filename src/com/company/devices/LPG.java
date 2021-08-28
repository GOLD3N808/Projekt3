package com.company.devices;

public class LPG extends Car {

    public LPG(String producer, String model, String color, int yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, color, value);
    }

    public void refuel()
    {
        System.out.println("dolej gazu");
    }
}
