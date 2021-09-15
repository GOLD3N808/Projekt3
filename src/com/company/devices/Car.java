package com.company.devices;
import com.company.Human;
import com.company.devices.salleable;
import java.util.ArrayList;
import java.util.List;

import com.company.devices.Device;


public abstract class Car extends Device implements salleable {



    public String color;
    public Double value;
    public double cena;
    public double rozmiar;
    public List<Human> wlasciciele = new ArrayList();
    public int jakaIloscTransakcji;

    public Car(String producer, String model, int yearOfProduction, String color, Double value, Human wlasciciel){
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
        wlasciciele.add(wlasciciel);
        this.jakaIloscTransakcji = 0;


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
            wlasciciele.add(buyer);





            seller.cash += cena;
            buyer.cash -= cena;

            System.out.println("Transakcja sprzedazy auta powiodla sie");
        }

    }

    public int sprawdzIloscTransakcji()
    {
        return this.jakaIloscTransakcji;
    }

    public boolean czyPosiadalWlasiciela(Human jakisCzlowiek)
    {
        return wlasciciele.contains(jakisCzlowiek);
    }

    public boolean czyAsprzedalB(Human seller, Human buyer)
    {
        if(this.czyPosiadalWlasiciela(seller) && this.czyPosiadalWlasiciela(buyer))
            if (wlasciciele.indexOf(seller) == wlasciciele.indexOf(buyer)-1)
                return true;

        return false;
    }

    public int numberTransakcji()
    {
        return wlasciciele.size();
    }






    public boolean equals(Object obj) {
        return (this == obj);
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
