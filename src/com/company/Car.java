package com.company;

import com.company.devices.Device;

public class Car extends Device {


    public double millage;
    public String color;
    public double engineVolume;
    double value;
    public String Car;

    public Car(String producer, String model){
        this.producer = producer;
        this.model = model;
    }


    public Car(String producer, String model, double millage, String color, double engineVolume){
        this.producer = producer;
        this.model = model;
        this.millage = millage;
        this.color = color;
        this.engineVolume = engineVolume;
    }
}
