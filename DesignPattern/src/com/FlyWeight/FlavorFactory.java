package com.FlyWeight;

import java.util.HashMap;

public class FlavorFactory {
	HashMap<String, Flavor> hm = new HashMap<String, Flavor>();
	
	private FlavorFactory() {
		// TODO Auto-generated constructor stub
	}
	
	static FlavorFactory INSTANCE = new FlavorFactory();
	public static FlavorFactory getINSTANCE() {
		return INSTANCE;
	}
	
	public Flavor getFlavor( String flavorName ) {
		Flavor f = hm.get(flavorName);
		if ( f == null ) {
			f = new Flavor(flavorName);
			hm.put(flavorName, f);
		}
		return f;
	}
}
