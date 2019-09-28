package com.utils;

public class Test {
	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		tree.insert(44);
		tree.insert(22);
		tree.insert(34);
		tree.insert(50);
		tree.insert(59);
		tree.insert(17);
		tree.delete(17);
		tree.inOrder();
	}
}
