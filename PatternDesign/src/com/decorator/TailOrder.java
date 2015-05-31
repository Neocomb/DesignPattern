package com.decorator;

public class TailOrder extends OrderDecorator {

	public TailOrder(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.order.print();
		printTail();
	}
	
	private void printTail() {
		// TODO Auto-generated method stub
		System.out.println("Date:"+ getSaleDate());
	}

}
