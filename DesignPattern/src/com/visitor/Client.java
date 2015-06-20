package com.visitor;

import java.util.ArrayList;
import java.util.Random;

public class Client {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		ArrayList<Node> al = new ArrayList<Node>();
		Class[] cls = { BranchNode.class , LeafNode.class };
		
		Random rd = new Random();
		for (int i = 0; i < 10 ; i++) {
			al.add( (Node) cls[rd.nextInt(2)].newInstance() );
		}
		
		Visitor v1 = new DeepFirstVisitor();
		for (Node node : al) {
			node.show(v1);
		}
		
		Visitor v2 = new BroadFirstVisitor();
		for (Node node : al) {
			node.show(v2);
		}
	}
}
