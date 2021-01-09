package com.juan;

public class Zoo {

    public static void main(String[] args) {
		System.out.println("****Factory Pattern Demo****");
	Animal duck = AnimalFactory.getAnimal("duck");
	duck.eat();
	duck.talk();
		System.out.println();
	Animal tiger = AnimalFactory.getAnimal("tiger");
	tiger.talk();
	tiger.eat();
		System.out.println();
	Animal cow = AnimalFactory.getAnimal("cow");
	cow.eat();
	cow.talk();


    }
}
