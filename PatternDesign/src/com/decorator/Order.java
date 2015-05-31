package com.decorator;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	
	private ArrayList<OrderLine> al = new ArrayList<OrderLine>();
	protected Date saleDate = new Date();
	protected String customerName;
	private int totlePrice;
	
	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void print() {
		double sum = 0;
		for (OrderLine orderLine : al) {
			orderLine.print();
			sum+=orderLine.getPrice();
		}
		System.out.println("Total Price :\t\t\t"+sum);
	}
	
	public void addItem( OrderLine ol ) {
		// TODO Auto-generated method stub
		al.add(ol);
	}
	
	public void removeItem( OrderLine ol ) {
		// TODO Auto-generated method stub
		al.remove(ol);
	}
	public void removeItem( int index ) {
		// TODO Auto-generated method stub
		
	}
}
