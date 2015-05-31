package com.factory;

public class Home {
	public static void main(String[] args) {
		Cat c = (Cat) AnimalFactory.createAnimal( AnimalFactory.Type.Cat );
		c.show();
		c.work();
		
		Dog d = (Dog) AnimalFactory.createAnimal(  AnimalFactory.Type.Dog );
		d.show();
		d.work();
	}
}
