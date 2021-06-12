package com.company;

import com.company.devices.Device;

public class Car extends Device {


    public double millage;
    public String color;
    public double engineVolume;
    double value;
    public String Car;

    public Car(String producer, String model, String yearOfproduction){
        super(producer, model, yearOfproduction);

    }

    public void turnOn(){
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
    }


    public Car(String producer, String model,String yearOfproduction, double millage, String color, double engineVolume){
        super(producer, model, yearOfproduction);

        this.millage = millage;
        this.color = color;
        this.engineVolume = engineVolume;
    }
}
