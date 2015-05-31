package com.strategy;


public class Book {
	public String name;
	public String author;
	public double price;
	public Book(String name, String author, double price ) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price
				+ "]";
	}
	synchronized final String getName() {
		return name;
	}
	synchronized final void setName(String name) {
		this.name = name;
	}
	synchronized final String getAuthor() {
		return author;
	}
	synchronized final void setAuthor(String author) {
		this.author = author;
	}
	synchronized final double getPrice() {
		return price;
	}
	synchronized final void setPrice(double price) {
		this.price = price;
	}	
	
}
