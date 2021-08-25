package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile {




    public void beEaten()
    {
        System.out.println("zjedzony");
    }

    public FarmAnimal(String species)
    {
        super(species);
    }



}
