package com.composite;

public abstract class Graphic {
	public String name;
	public Graphic(String name) {
		this.name = name;
	}
	public abstract void draw();
}
