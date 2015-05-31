package com.composite;

public class Rectangle extends Graphic {

	public Rectangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println( name + " Rectangle is drawing");
	}

}
