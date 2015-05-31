package com.singleton;

public class SingletonChild extends Singleton {
	protected SingletonChild() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonChild getInstance( String name ){
		return (SingletonChild) Singleton.getInstance( SingletonChild.class.getName() );		
	}
	
	public void about() {
		System.out.println("hello , i'am SingletonChild");
	}
}
