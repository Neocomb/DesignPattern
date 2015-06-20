package com.state;

public class Home {
	public static void main(String[] args) {
		Door door = new Door();
		door.open();
		door.close();
		door.close();
		door.open();
		door.open();
	}
}
