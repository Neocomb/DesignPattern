package com.decorator;

import java.util.HashMap;
import java.util.Map;

public class OrderLine{
	
	static private HashMap<String , Double> map = new HashMap<String, Double>();
	static{
		map.put("Cookie", 5.8);
		map.put("Cocoa", 2.8);
		map.put("JellyBean", 7.5);
		map.put("Sanwiche", 15.0);
		map.put("Icecream", 4.5);
		map.put("Honey", 13.4);
		map.put("Milk", 2.3);
	}
	
	private String name;
	private int num;
	private double price ;
	
	public OrderLine(String name, int num) {
		this.name = name;
		this.num = num;
		this.price = map.get(name)*num;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Name:\t"+name +"\tPrice:\t"+num*map.get(name)+"\t");
	}

	 public double getPrice() {
		return price;
	}
	
}
