package com.company;
import java.util.Date;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {


    public Phone phone;
    String firstName;
    String lastName;
    Animal pet;
    private Car car;
    private Double salary;
    private String pesel;
    public Double cash = 0.0;

    public String toString(){
        return "firstName: "+firstName+"lastName:  "+lastName+"pet:"+pet+" car: "+car+"salary:  "+salary+"pesel:"+pesel;
    }



    public String getPesel() {

        return pesel;
    }

    public void setPesel(String pesel) {

        this.pesel = pesel;
    }


    public double getSalary() {

        System.out.println(new Date());
        System.out.println("wypłata " + this.salary);
        return salary;

    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Wartość wypłaty nie może być ujemna");
        }

        System.out.println("Nowe dane zostały wysłane do systemu");

        System.out.println("Jest koniecznosc odebrania aneksu do umowy od pani Hani z kadr");

        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");

        this.salary = salary;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car newCar) {
        if (salary > newCar.value) {
            System.out.println("Samochód udało się kupić za gotówkę");
            this.car = newCar;
        } else if (salary > newCar.value / 12) {
            System.out.println("Udało się kupić na kredyt (no trudno)");
            this.car = newCar;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }


    }
}
