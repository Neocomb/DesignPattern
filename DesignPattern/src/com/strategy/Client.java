package com.strategy;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		usage();
		
		String cmd ;
		ShoppingCar shoppingCar = new ShoppingCar( new SpringDiscountStrategyImpl() );
		Scanner sc = new Scanner(System.in);
		while ( ( cmd = sc.nextLine()) != null ) {
			String[] orders = cmd.split(" ");
			switch ( orders[0] ) {
			case "add":
				shoppingCar.addBook( Library.getBook( Integer.parseInt( orders[1]) ), Integer.parseInt(orders[2]));
				System.out.println("添加成功");
				break;
			case "del":
				shoppingCar.delBook( Library.getBook( Integer.parseInt( orders[1]) ));
				System.out.println("删除成功");
				break;
			case "buy":
				shoppingCar.countTotal();
				break;
			case "show":
				Library.show();
				break;
			default:
				usage();
				break;
			}
		}
	}
	
	public static void usage() {
		System.out.println("===============================");
		System.out.println("显示书库: show ");
		System.out.println("添加书籍: add [Book id] [Count]");
		System.out.println("去掉书籍: del  [Book id] ");
		System.out.println("清空购物车: clear ");
		System.out.println("结算: buy ");
		System.out.println("===============================");
		
	}
}
