package com.company;

public class Human {

    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;

    private String pesel1;
    public String pesel2;

    public String getPesel1(){
        return pesel1;
    }

    public void setPesel1(String pesel){
        this.pesel1 = pesel;
    }
}
