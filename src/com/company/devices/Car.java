package com.company.devices;
import com.company.Human;
import com.company.devices.salleable;

import com.company.devices.Device;


public abstract class Car extends Device implements salleable {



    public String color;
    public Double value;
    public Human[] owners;
    public int iloscTransakcji;
    public double cena;
    public double rozmiar;

    public Car(String producer, String model, int yearOfProduction, String color, Double value){
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
        this.owners = new Human[3];
        this.iloscTransakcji = 0;


    }
    public void sell(Human seller, Human buyer, Double price)
    {

        {
            if (seller.garage == null && seller.garage.length == 0 )
            {
                System.out.println("Sprzedajacy nie ma samochodow");
            }
            if (buyer.garage != null)
            {
                System.out.println("Kupujacy nie ma miejsca w garazu");
            }
            if (buyer.cash < cena)
            {
                System.out.println("Kupujacy nie ma pieniedzy");
            }





            seller.cash += cena;
            buyer.cash -= cena;

            System.out.println("Transakcja sprzedazy auta powiodla sie");
        }

    }









    public void TurnOn()
    {
        System.out.println("Car turning on");
    }

   /* public boolean equals(Object obj) {
        return (this == obj);
    }

    public String toString(){
        return "model: "+model+"producer: "+producer+"color: "+color+"yearOfProduction: "+ yearOfProduction +"value: "+value;


    }*/

    abstract public void refuel();
    {

    }
}
