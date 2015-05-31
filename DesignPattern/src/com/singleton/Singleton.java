package com.singleton;

import java.util.HashMap;

public class Singleton {
	private static HashMap<String, Singleton> hm = new HashMap<String, Singleton >();
	static {
		Singleton s = new Singleton();
		hm.put( s.getClass().getName() ,	 new Singleton() );
	}
	protected Singleton(){}
	
	public static Singleton getInstance( String name ) {
		if ( name == null ) {
			name = Singleton.class.getName();			
		}
		if ( hm.get(name) == null ) {
			try {
				hm.put( name , (Singleton) Class.forName(name).newInstance() );
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return hm.get(name);
		
	}
	
	public void about() {
		System.out.println("hello , i'am Singleton");
	}
}
