package com.decorator;

public class OrderDecorator extends Order {
	Order order;
	
	public OrderDecorator( Order order ) {
		// TODO Auto-generated constructor stub
		this.order = order;
		customerName  = order.customerName;
		saleDate = order.saleDate;
	}
}
