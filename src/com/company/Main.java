package com.company;
import com.company.devices.Device;

public class Main {

	public static void main(String[] args) {

		Human me = new Human("Kowalski");
		Car passat = new Car("vw", "passat", "yearOfproduction");


		me.setPesel1("123456789");
		me.pesel2 = "123456789";

		System.out.println(me.getPesel1());
		System.out.println(me.pesel2);





		me.feed();
		me.takeForWalk();
		System.out.println(me.species);
		me.printName();














	}
}

    	/*
	Animal dog = new Animal("dog");
	dog.name = "szarik";

	dog.feed();
	dog.takeForWalk();
	dog.feed();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();

		dog.feed();


/*
	System.out.println(dog.name);
	System.out.println(dog.species);

	dog.printName();
	dog.printNameAndOwner("kacper");

	String text = dog.getNameAndOwner("kacper");
	System.out.println(text);

	Human kacper = new Human();
	kacper.pet = dog;
	kacper.firstName = "kacper";
	kacper.lastName = "Warda";

	System.out.println(kacper.pet.species);

*/


