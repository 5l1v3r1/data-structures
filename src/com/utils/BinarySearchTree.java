package com.utils;

import java.util.Comparator;

public class BinarySearchTree <T> {
	private TreeNode<T> root = null;
	
	public void insert(T data) {
		root = add(root, data);		
	}
	
	private TreeNode<T> add(TreeNode<T> current, T data) {
		if(current == null) {
			return new TreeNode<T>(data);
		}
		
//		if(curr)
//			current.left = add(current.left, data);
//		else if(data > current.data)
//			current.right = add(current.right, data);
//		else
//			return current;
		return current;
	}
	
	public void preOrder() {
		preOrderTraversal(root);
	}
	
	public void inorder() {
		inorderTraversal(root);
	}
	
	public void postOrder() {
		postOrderTraversal(root);
	}
	
	private void preOrderTraversal(TreeNode<T> root) {
		if(root == null)
			return;
		
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	private void inorderTraversal(TreeNode<T> root) {
		if(root == null)
			return;
		
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}
	
	private void postOrderTraversal(TreeNode<T> root) {
		if(root == null)
			return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}

}

class TreeNode <T> implements Comparator<T>{
	T data;
	TreeNode<T> left;
	TreeNode<T> right;
	
	public TreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	@Override
	public int compare(T o1, T o2) {
		return 0;
	}
	
}
