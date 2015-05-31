package com.Memento;

public class Client {
	public static void main(String[] args) {
		Originator org = new Originator();
		Caretaker car = new Caretaker();
		
		org.setState("Hello World");
		car.addMem("Base", org.createMem() );
		
		org.setState("Web Programming");
		car.addMem("Junnior", org.createMem() );
		System.out.println( "Junnior State : " + org );
		
		org.setState("Pattern Design");
		car.addMem("Sennior",  org.createMem() );
		System.out.println( "Sennior State : " +org );
		
		org.restoreMem( car.getMem("Junnior") );
		System.out.println( "Restore Junnior State : " + org );
		org.restoreMem( car.getMem("Sennior") );
		System.out.println( "Restore Sennior State : " + org );
	}
}
