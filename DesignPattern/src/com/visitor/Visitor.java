package com.visitor;

public interface Visitor {
	void visit( BranchNode bn );
	void visit( LeafNode ln );
}
