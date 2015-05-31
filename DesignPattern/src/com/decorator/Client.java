package com.decorator;

import java.util.Date;

public class Client {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.setCustomerName("谢国东");
		order.setSaleDate( new Date() );
		
		order.addItem( new OrderLine("Milk", 20 ));
		order.addItem( new OrderLine("Sanwiche", 10 ));
		order.addItem( new OrderLine("Cocoa", 15 ));
		
		Order all = new HeadOrder( new TailOrder(order));
		all.print();		
		
	}
}
