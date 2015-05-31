package com.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Subject extends Observable{

	public String status ;

	public void setStatus( String status ) {
		this.setChanged();
		this.status = status;
	}
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		super.notifyObservers( status );
	}
}
