package com.company;
import com.company.devices.Device;

public class Main {

	public static void main(String[] args) {
		Human me = new Human();
		Car passat = new Car("vw", "passat", "brown", 2005);
	me.setCar(passat);

		Car corsa = new Car("Opel","Corsa","yellow", 2000);
		boolean areEqual = passat.equals(corsa);

		Animal szarik = new Animal("dog");
		me.pet = szarik;
		System.out.println(szarik);
		System.out.println(passat.toString());
		System.out.println(szarik.toString());
		System.out.println(me.toString());
		Phone nokia = new Phone();
		System.out.println(nokia.toString());



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
		szarik.takeForWalk();



	}
}




