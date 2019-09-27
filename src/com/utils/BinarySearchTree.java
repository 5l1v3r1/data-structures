package com.utils;

public class BinarySearchTree <T extends Comparable<T>> {
	private TreeNode<T> root = null;
	
	public void insert(T data) {
		root = add(root, data);		
	}
	
	private TreeNode<T> add(TreeNode<T> current, T data) {
		if(current == null) {
			return new TreeNode<T>(data);
		}
		
		if(data.compareTo(current.data) < 0)
			current.left = add(current.left, data);
		else if(data.compareTo(current.data) > 0)
			current.right = add(current.right, data);
		else
			return current;
		return current;
	}
	
	public void preOrder() {
		preOrderTraversal(root);
	}
	
	public void inOrder() {
		inOrderTraversal(root);
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
	
	private void inOrderTraversal(TreeNode<T> root) {
		if(root == null)
			return;
		
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}
	
	private void postOrderTraversal(TreeNode<T> root) {
		if(root == null)
			return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}

}

class TreeNode <T>{
	T data;
	TreeNode<T> left;
	TreeNode<T> right;
	
	public TreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
