package com.greatlearning.tree;

public class skewedtree {
	public static node transform(node root) {
		if(root == null)return null;
		else {
		node pre = null,post = null;
		pre = transform(root.left);
		post =  transform(root.right);
		root.right=post;
		if(pre!=null) {
		node temp = pre;
		while(temp.right!=null) {
			temp=temp.right;
		}
			temp.right=root;
			root = pre;
		}
			return root;
		}
		
	}
}
