package com.state;

public class OpenState extends State {
	
	@Override
	public void open(Door door) {
		// TODO Auto-generated method stub
		System.out.println("The Door is already open!");
	}

	@Override
	public void close(Door door) {
		// TODO Auto-generated method stub
		System.out.println("The door close");
		door.setState(new CloseState());
	}

}
