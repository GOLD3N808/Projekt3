package com.company.devices;

    public abstract class Device {

     String producer;
     String model;
     int yearOfProduction;



    public String toString(){

            return "producer "+producer+"model"+model+"yearOfproduction"+yearOfProduction;
    }

    abstract void TurnOn();






}
