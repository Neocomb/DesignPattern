package com.strategy;

import java.util.ArrayList;
import java.util.HashSet;

public final class Library {
	private static ArrayList<Book> al = new ArrayList<Book>();
	static{
		al.add( new Book( "Think in java", "Bruce Eckel ", 59.9));
		al.add( new Book("Java涓庢ā寮�","", 45.8 ));
		al.add( new Book( "绠楁硶瀵艰", "Someone",110.0 ));
		al.add( new Book("璁捐妯″紡","GOF4" ,98.4 ));
	}
	
	public static void show() {
		int num = 1;
		System.out.println("=======================");
		for (Book book : al) {
			System.out.print( num ++ + " . ");
			System.out.println(book);
		}
		System.out.println("=======================");
	}
	
	public static Book getBook( int index ) {
		index--;
		return al.get(index>al.size()-1?al.size()-1:index);
	}
}
