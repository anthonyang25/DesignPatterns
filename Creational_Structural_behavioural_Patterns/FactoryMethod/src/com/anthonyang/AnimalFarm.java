package com.anthonyang;

public class AnimalFarm {
	public static Animal getAnimal(AnimalType animalType) {

		switch (animalType) {
		case DOG:
			return new Dog();
		case CAT:
			return new Cat();
		case RABBIT:
			return new Rabbit();
		case SINGLETON_OBJECT:
			return IntegrateSingleton.getInstance();
		default:
			return null;
		}
	}
}
