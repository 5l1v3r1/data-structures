package com.utils;

public class BinarySearchTree {
	class TreeNode<T> {
		T data;
		TreeNode<T> left;
		TreeNode<T> right;
		
		public TreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
}
