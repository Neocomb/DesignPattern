package com.decorator;

public class HeadOrder extends OrderDecorator {

	public HeadOrder(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		printHead();
		super.order.print();
	}
	
	private void printHead() {
		// TODO Auto-generated method stub
		System.out.println("Customer：" + order.getCustomerName() );
	}

}
