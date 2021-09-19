package com.company;
import java.util.Date;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import java.util.Date;
import java.util.*;
import com.company.devices.Device;

public class Human {


    public Phone phone;
    String firstName;
    String lastName;
    Animal pet;

    private String pesel;
    public double cash = 0.0;
    public double salary;
    public Car[] garage;
    //public double rozmiar;





    public Human()
    {
        garage = new Car[2];
    }

    public Human(int rozmiar)
    {
        this.garage = new Car[rozmiar];
    }

    public Car getCar( int nrMiejscaParkingowego)
    {
        return this.garage[nrMiejscaParkingowego];
    }



    public void setCar(Car noweAuto, int nrMiejscaParkingowego)
    {
        if (salary > noweAuto.cena)
        {
            System.out.println("Samochód udało się kupić za gotówkę");
            this.garage[nrMiejscaParkingowego] = noweAuto;
        }
        else if (salary > noweAuto.cena/24)
        {
            System.out.println("Udało się kupić na kredyt (no trudno)");
            this.garage[nrMiejscaParkingowego] = noweAuto;
        }
        else
        {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

   /* public void sortCars()
    {
        Arrays.sort();

        garage[1].yearOfProduction = 23;
    }*/

    public double carsValue(Device wartosc)
    {
         wartosc.value = 0.0;

        for (int i = 0; i< garage.length; i++)

        {
            wartosc.value += garage[i].cena;
        }

        return wartosc.value;
    }







    public String toString()
    {
        return "firstName: "+firstName+"lastName:  "+lastName+"pet:"+pet +"salary:  "+salary+"pesel:"+pesel;
    }



    public String getPesel()
    {
        return pesel;
    }

    public void setPesel(String pesel)
    {
        this.pesel = pesel;
    }

    public double getSalary() {
        System.out.println(new Date());
        System.out.println("wartość wypłaty " + this.salary);
        return salary;
    }


}
