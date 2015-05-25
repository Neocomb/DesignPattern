package com.composite;

public class Circle extends Graphic {

	public Circle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println( name + " Circle is drawing");
	}

}
