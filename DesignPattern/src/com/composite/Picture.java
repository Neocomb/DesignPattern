package com.composite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Picture extends Graphic{

	public Picture(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	HashSet<Graphic> hs = new HashSet<Graphic>();
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println( name + " Picture drawing");
		for (Graphic graphic : hs) {
			graphic.draw();
		}
	}
	
	public void add( Graphic g ) {
		hs.add(g);
	}
	
	public Iterator<Graphic> iterator( Graphic g ) {
		return hs.iterator();
	}

}
