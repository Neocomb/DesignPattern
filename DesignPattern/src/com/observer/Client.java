package com.observer;

import java.util.Observable;
import java.util.Observer;

public class Client {
	public static void main(String[] args) {
		Subject sb = new Subject();
		
		System.out.println("start add");
		sb.addObserver( new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				// TODO Auto-generated method stub
				System.out.println( "client is changed : msg is " + arg );
			}
		});
		
		System.out.println( "Observers :" + sb.countObservers() );
		
		sb.setStatus( "one ");
		sb.notifyObservers();
		sb.setStatus( "two ");
		sb.notifyObservers();
		sb.setStatus( "three ");
		sb.notifyObservers();
	}
}
