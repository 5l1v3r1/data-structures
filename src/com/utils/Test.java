package com.utils;

public class Test {
	public static void main(String[] args) {
		BinarySearchTree<String> tree = new BinarySearchTree<String>();
		tree.insert("HA");
		tree.insert("AI");
		tree.insert("IO");
		tree.insert("AA");
		tree.inorder();
	}
}
