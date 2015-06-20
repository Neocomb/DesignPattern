package com.visitor;

public class BroadFirstVisitor implements Visitor{

	@Override
	public void visit(BranchNode bn) {
		// TODO Auto-generated method stub
		System.out.print("BroadFirstVisitor:");
		bn.branchVisit();
	}

	@Override
	public void visit(LeafNode ln) {
		// TODO Auto-generated method stub
		System.out.print("BroadFirstVisitor:");
		ln.leafVisit();
	}

}
