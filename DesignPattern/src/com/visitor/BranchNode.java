package com.visitor;

public class BranchNode extends Node{

	@Override
	public void show(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	
	public void branchVisit() {
		System.out.println( "BranchNode has been visited !");
	}

}
