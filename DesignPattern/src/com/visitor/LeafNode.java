package com.visitor;

public class LeafNode extends Node{

	@Override
	public void show(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	public void leafVisit() {
		System.out.println( "LeafNode has been visited !");
	}
}
