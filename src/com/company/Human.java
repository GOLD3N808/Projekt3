package com.company;

import com.company.Animal;

public class Human extends Animal {

    private static final String HUMAN_SPECIES;

    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private Double salary;

    public Human(String lastName) {
        super(HUMAN_SPECIES);
        this.lastName = lastName;
    }

    public Double getSalary(){

    }

    private String pesel1;
    public String pesel2;

    public String getPesel1(){
        return pesel1;
    }


    public void setPesel1(String pesel){
        this.pesel1 = pesel;
    }
}
