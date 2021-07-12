package com.company;

import com.company.devices.Device;

public class Car {

    public String model;
    public String producer;
    public String color;
    public int yearOfProduction;
    public Double value;

    public Car(String model, String producer, String color, int yearOfProduction){
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.value = value;



    }

    public boolean equals(Object obj) {
        return (this == obj);
    }

    public String toString(){
        return "model: "+model+"producer: "+producer+"color: "+color+"yearOfProduction: "+ yearOfProduction +"value: "+value;
    }
}
