package com.FlyWeight;

public class Client {
	public static void main(String[] args) {
		FlavorFactory ff = FlavorFactory.getINSTANCE();
		
		ff.getFlavor("拿铁").server(new Table(1));
		ff.getFlavor("南山").server(new Table(2));
		ff.getFlavor("南山").server(new Table(3));
		ff.getFlavor("南山").server(new Table(4));
		ff.getFlavor("卡布奇诺").server(new Table(5));
		ff.getFlavor("拿铁").server(new Table(6));
		ff.getFlavor("卡布奇诺").server(new Table(7));
		ff.getFlavor("苦咖啡").server(new Table(8));
		
	}
}
