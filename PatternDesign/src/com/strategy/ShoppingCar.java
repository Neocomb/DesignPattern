package com.strategy;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ShoppingCar {
	HashMap<Book,Integer> hm = new HashMap<Book, Integer>(); 
	DiscountStrategy ds ;
	
	public ShoppingCar(DiscountStrategy ds) {
		this.ds = ds;
	}

	public void addBook( Book book , int num ) {
		// TODO Auto-generated method stub
		hm.put(book,num);
	}
	
	public void delBook(Book book) {
		// TODO Auto-generated method stub
		hm.remove( book );
	}
	
	public void setDs(DiscountStrategy ds) {
		this.ds = ds;
	}
	
	public double countTotal() {
		double totalPrice = 0;
		Set<Entry<Book, Integer>> set = hm.entrySet();
		for (Entry<Book, Integer> entry : set ) {
			totalPrice += ds.total( entry.getKey().price , entry.getValue() );
		}
		System.out.println("The Total Price is $"+totalPrice);
		return 0;		
	}
	
	public void clear() {
		// TODO Auto-generated method stub
		hm.clear();
	}
}
