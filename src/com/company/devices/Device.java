package com.company.devices;

    public abstract class Device {

    public final String producer;
    public final String model;
    public final String yearOfproduction;

    public Device(String producer, String model, String yearOfproduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfproduction = yearOfproduction;
    }

    public String toString(){

            return "producer "+producer+"model"+"yearOfproduction"+yearOfproduction;
    }

    abstract public void turnOn();


}
