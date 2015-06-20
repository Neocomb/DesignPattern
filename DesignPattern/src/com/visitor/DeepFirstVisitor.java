package com.visitor;

public class DeepFirstVisitor implements Visitor{

	@Override
	public void visit(BranchNode bn) {
		// TODO Auto-generated method stub
		System.out.print("DeepFirstVisitor:");
		bn.branchVisit();
	}

	@Override
	public void visit(LeafNode ln) {
		// TODO Auto-generated method stub
		System.out.print("DeepFirstVisitor:");
		ln.leafVisit();
	}

}
