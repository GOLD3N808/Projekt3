package com.company.devices;
import com.company.Human;

public class LPG extends Car {

    public LPG(String producer, String model, String color, int yearOfProduction, Double value, Human wlasciciel) {
        super(producer, model, yearOfProduction, color, value, wlasciciel);
    }

    public void refuel()
    {
        System.out.println("dolej gazu");
    }
}
