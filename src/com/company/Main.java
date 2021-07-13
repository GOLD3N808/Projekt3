package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

	public static void main(String[] args) {
		Human me = new Human();
		Car passat = new Car("vw", "passat", 2005, "brown", 2000.5);
	me.setCar(passat);

		Car corsa = new Car("Opel","Corsa", 2000, "yellow", 2023.5);
		boolean areEqual = passat.equals(corsa);
/*
		Animal szarik = new Animal("dog");
		me.pet = szarik;
		System.out.println(szarik);
		System.out.println(passat.toString());
		System.out.println(szarik.toString());*/
		System.out.println(me.toString());
		Phone nokia = new Phone();
		System.out.println(nokia.toString());
		Car Q7 = new Car("Audi", "Q7", 2017,"black", 70000.5);
		Phone samsung = new Phone();
		Q7.TurnOn();
		samsung.TurnOn();

		Human seller = new Human();
		Human buyer = new Human();
	/*uyer.cash = 2300.0;
		seller.phone = new Phone();
		seller.pet = new Animal("owczarek");
		seller.phone.sell(seller, buyer, 543.5);
		seller.pet.sell(seller, buyer, 394.5);






		szarik.feed();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();
				szarik.takeForWalk();*/
	}
}