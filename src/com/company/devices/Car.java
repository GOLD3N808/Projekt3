package com.company.devices;

import com.company.devices.Device;

public abstract class Car extends Device {



    public String color;
    public Double value;

    public Car(String producer, String model, int yearOfProduction, String color, Double value){
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.value = value;



    }

    public void TurnOn()
    {
        System.out.println("Car turning on");
    }

    public boolean equals(Object obj) {
        return (this == obj);
    }

    public String toString(){
        return "model: "+model+"producer: "+producer+"color: "+color+"yearOfProduction: "+ yearOfProduction +"value: "+value;


    }

    abstract void refuel();
}
