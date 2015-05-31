package com.composite;

public class Demo {
	public static void main(String[] args) {
		Picture p = new Picture("root");
		
		p.add( new Circle("root circle") );
		p.add( new Rectangle("root rectangle") );
		
		Picture p2 = new Picture("leaf");
		p2.add( new Circle("leaf circle") );
		p2.add( new Rectangle("leaf rectangle") );
		
		p.add( p2 );
		
		p.draw();
	}
}
