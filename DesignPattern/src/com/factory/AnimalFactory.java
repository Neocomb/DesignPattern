package com.factory;

import java.util.HashMap;

public class AnimalFactory {
	private AnimalFactory() {
		// TODO Auto-generated constructor stub
	}
	public enum Type{
		Cat,
		Dog
	}
	private static HashMap<Type, Class<? extends Animal>> hm;
	static{
		hm = new HashMap<AnimalFactory.Type, Class<? extends Animal>>();
		hm.put(Type.Cat, Cat.class);
		hm.put(Type.Dog , Dog.class);
	}
	
	public static Animal createAnimal( Type t ) {
		try {
			return (Animal) hm.get(t).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
}
