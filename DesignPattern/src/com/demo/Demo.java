package com.demo;

import com.singleton.Singleton;
import com.singleton.SingletonChild;

public class Demo {
	public static void main(String[] args) {
		SingletonChild sc = SingletonChild.getInstance(null);
		SingletonChild sc2 = SingletonChild.getInstance(null);
		Singleton s = Singleton.getInstance(null);
		
		try {
			SingletonChild sc3 = (SingletonChild) Class.forName("com.singleton.SingletonChild").newInstance();
			sc3.about();
			System.out.println( sc == sc3 );
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( sc.getClass().getName() );
		System.out.println( sc == sc2 );
		sc.about();
	}
}
