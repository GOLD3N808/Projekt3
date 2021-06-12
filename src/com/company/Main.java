package com.company;

public class Main {

	public static void main(String[] args) {

		Human me = new Human();
		Car passat = new Car("vw", "passat");
		me.Car = passat;

		me.setPesel1("123456789");
		me.pesel2 = "123456789";

		System.out.println(me.getPesel1());
		System.out.println(me.pesel2);

		Human be = new Human();

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


