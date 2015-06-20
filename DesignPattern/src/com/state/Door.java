package com.state;

public class Door {
	State state;
	
	public Door() {
		// TODO Auto-generated constructor stub
		setState(new CloseState());
	}

	State getState() {
		return state;
	}

	void setState(State state) {
		this.state = state;
	}
	
	public void open() {
		// TODO Auto-generated method stub
		state.open(this);
	}
	
	public void close() {
		// TODO Auto-generated method stub
		state.close(this);
	}
}
