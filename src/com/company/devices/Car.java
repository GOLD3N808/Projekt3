package com.company.devices;
import com.company.Human;
import com.company.devices.salleable;

import com.company.devices.Device;

public abstract class Car extends Device implements salleable {



    public String color;
    public Double value;

    public Car(String producer, String model, int yearOfProduction, String color, Double value){
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.value = value;



    }
    public void sell(Human seller, Human buyer, Double price)
    {
        try
        {
            if (seller.garage.length == 0)
            {
                throw new IllegalAccessException("Sprzedajacy nie ma aut");
            }
            if (buyer.garage[0] != null && buyer.garage[1] != null && buyer.garage[2] != null)
            {
                throw new IllegalAccessException("Kupujacy nie ma miejsca w garazu");
            }
            if (buyer.cash < price)
            {
                throw new IllegalAccessException("Kupujacy nie ma pieniedzy");
            }

            if (buyer.garage[0] == null)
            {
                buyer.garage[0] = this;
            }
            if (buyer.garage[1] == null)
            {
                buyer.garage[1] = this;
            }
            if (buyer.garage[2] == null)
            {
                buyer.garage[2] = this;
            }

            seller.cash += price;
            buyer.cash -= price;

            System.out.println("Transakcja sprzedazy auta powiodla sie");
        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught in main.");
        }
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
