package com.FlyWeight;

public class Flavor extends Order{
	public String flavor;
	public String getFlavor() {
		return flavor;
	}
	public Flavor(String flavor) {
		super();
		this.flavor = flavor;
	}
	@Override
	public String getFlover() {
		// TODO Auto-generated method stub
		return flavor;
	}
	@Override
	public void server(Table table) {
		// TODO Auto-generated method stub
		System.out.println("Table " + table.getTableID() + " wanna a cup of " + getFlavor() );
	}
}
