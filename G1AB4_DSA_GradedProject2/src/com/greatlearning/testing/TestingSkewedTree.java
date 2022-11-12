package com.greatlearning.testing;

import com.greatlearning.tree.*;
public class TestingSkewedTree {
	public static void main(String[] args) { //tested for extra nodes
		node root = new node(50);
		root.left = new node(30);
	    root.right = new node(60);
	    root.left.left = new node(10);
	    //root.left.right = new node(40);
	    root.right.left= new node(55);
	    //root.right.right= new node(70);
	    //root.right.right.left= new node(69);
	    //root.right.right.left.left= new node(68);
	    node a = skewedtree.transform(root);
	    while(a!=null) {System.out.println("*"+a.key+"*");a=a.right;}
	}
}
