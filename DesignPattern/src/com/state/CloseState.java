package com.state;

public class CloseState extends State {

	@Override
	public void open(Door door) {
		// TODO Auto-generated method stub
		System.out.println("The door open");
		door.setState(new OpenState());
	}

	@Override
	public void close(Door door ) {
		// TODO Auto-generated method stub
		System.out.println("The door is already closed!");
	}

}
