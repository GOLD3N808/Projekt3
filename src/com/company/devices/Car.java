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
    //public double rozmiar;
    public List<Human> wlasciciele = new ArrayList();
    public int jakaIloscTransakcji;

    public Car(String producer, String model, int yearOfProduction, String color, Double value, Double cena, Human wlasciciel){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.value = value;
        this.cena = cena;
        wlasciciele.add(wlasciciel);
        this.jakaIloscTransakcji = 0;


    }
    public void sell(Human seller, Human buyer, Double price)
    {
        int n = 0;
        int k = 0;


            if (seller.garage.length == 0 ) //sprawdzenie czy sprzedajacy posiada garaz
            {
                System.out.println("Sprzedajacy nie ma garazu");
            }
            else
            {
                k++;
            }

            if (seller.garage.length != 0) // sprawdzenie czy garaz sprzedajacego jest pusty
            {
                k++;
                for(int i =0; i<seller.garage.length; i++)
                {
                    if (seller.garage[i] == null )
                    {
                        n++;
                    }
                }
                if (n == seller.garage.length)
                {
                    System.out.println("Sprzedajacy nie posiada samochodow");
                }
                else
                {
                    k++;
                }
            }
            n =0;

            for(int i =0; i<seller.garage.length; i++) // sprawdzenie czy sprzedajacy posiada wlasnie ten samochod
            {
                if (seller.garage[i] == this )
                {
                    n++;
                }
            }
            if (n == 1)
            {
                k++;
            }

            n=0;

            if (buyer.garage.length == 0 ) //sprawdzenie czy kupujacy posiada garaz
            {
                System.out.println("kupujacy nie posiada garazu");
            }
            else
            {
                k++;
            }

            if (buyer.garage.length != 0)  //sprawdzenie czy w garazu kupujacego jest miejsce
            {
                k++;
                for (int i = 0; i < buyer.garage.length; i++)
                {
                    if (buyer.garage[i] != null)
                        n++;
                }
                if (n == buyer.garage.length)
                {
                    System.out.println("kupujacy nie ma miejsca w garazu");
                }
                else
                {
                    k++;
                }
            }


            if (buyer.cash < cena) // sprawdzenie czy kupujacy ma dosc pieniedzy
            {
                System.out.println("Kupujacy nie ma pieniedzy");
            }
            else
            {
                k++;
            }

            if(k==8)
            {
                wlasciciele.add(buyer);

                for (int i = 0; i < seller.garage.length; i++) {
                    if (seller.garage[i] == this)
                    {
                        seller.garage[i] = null;
                    }
                }

                for (int i = 0; i < buyer.garage.length; i++) {
                    if (buyer.garage[i] == null)
                    {
                        buyer.garage[i] = this;
                    }
                }

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
