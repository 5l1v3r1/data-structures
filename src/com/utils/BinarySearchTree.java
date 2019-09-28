package com.utils;

public class BinarySearchTree <T extends Comparable<T>> {
	private TreeNode<T> root = null;
	
	public void insert(T data) {
		root = insertRecursive(root, data);		
	}
	
	public Boolean contains(T data) {
		return findNode(root, data);
	}
	
	public void delete(T data) {
		root = deleteRecursive(root, data);
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
	
	private TreeNode<T> insertRecursive(TreeNode<T> current, T data) {
		if(current == null) {
			return new TreeNode<T>(data);
		}
		
		if(data.compareTo(current.data) < 0)
			current.left = insertRecursive(current.left, data);
		else if(data.compareTo(current.data) > 0)
			current.right = insertRecursive(current.right, data);
		else
			return current;
		
		return current;
	}
	
	private Boolean findNode(TreeNode<T> current, T data) {
		if(current == null)
			return false;
		
		if(data.compareTo(current.data) == 0)
			return true;
		
		return data.compareTo(current.data) < 0 ? findNode(current.left, data) : findNode(current.right, data);
	}
	
	private TreeNode<T> deleteRecursive(TreeNode<T> current, T data){
		if(current == null)
			return null;
		
		if(data.compareTo(current.data) == 0) {
			if(current.left == null && current.right == null)
				return null;
			
			if(current.left == null)
				return current.right;
			
			if(current.right == null)
				return current.left;
			
			current.data = findSmallestValue(current.right);
			current.right = deleteRecursive(current.right, current.data);
			return current;
		}
		
		else if(data.compareTo(current.data) < 0) {
			current.left = deleteRecursive(current.left, data);
			return current;
		}
		
		current.right = deleteRecursive(current.right, data);
		return current;
	}
	
	private T findSmallestValue(TreeNode<T> node) {
		return node.left == null ? node.data : findSmallestValue(node.left);
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
