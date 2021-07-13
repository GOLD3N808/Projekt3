package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.*;
import com.company.devices.Diesel;
import com.company.devices.Electric;
public class Main {

	public static void main(String[] args) {


LPG saab1 = new LPG("saab", "900", "blue", 2005, 23000.0);
        Diesel Opel1 = new Diesel("Opel", "Omega", "black", 2011, 3000.0);
        Electric Opel2 = new Electric("Opel", "Astra", "green", 2020, 23000.5);
        saab1.refuel();
        Opel1.refuel();
        Opel2.refuel();

        Human seller = new Human();
        Human buyer = new Human();
        buyer.cash = 255.0;
        Car saab2 = new LPG("saab", "900", "blue", 2005, 23000.0);
        buyer.garage[0] = saab2;
        saab2.sell(seller, buyer, 5555.0);




	}
}