package com.company;

public class Main {

	public static void main(String[] args) {

		Human me = new Human();
		Car passat = new Car("vw", "passat");
		me.car = passat;
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


