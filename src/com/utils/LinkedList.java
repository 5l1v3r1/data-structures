package com.utils;

public class LinkedList <T> {	
	private Node<T> head = null;
	
	public Boolean isEmpty() {
		if(head == null)
			return true;
		return false;
	}
	
	public void insertAtBeginning(T data) {
		Node<T> newNode = new Node<T>(data);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAfter(T data, T newData) {
		Node<T> newNode = new Node<T>(newData);
		
		Node<T> tempNode = head;
		while(tempNode.data != data) {
			tempNode = tempNode.next;
		}
		
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}
	
	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<T>(data);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		
		Node<T> tempNode = head;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		
		tempNode.next = newNode;
	}
	
	public void removeFromBeginning() {
		if(isEmpty())
			return;
		head = head.next;
	}
	
	public void removeFromEnd() {
		if(isEmpty())
			return;
		
		Node<T> tempNode = head;
		Node<T> prevNode = null;
		while(tempNode.next != null) {
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		prevNode.next = null;
	}
	
	public void removeAt(int index) {
		if(isEmpty())
			return;
		
		Node<T> tempNode = head;
		Node<T> prevNode = null;
		for(int i = 0; i<index; i++) {
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		prevNode.next = tempNode.next;
	}
	
	@Override
	public String toString() {
		String str = head.toString();
		Node<T> tempNode = head;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
			str = str + " " + tempNode;
		}
		return str;
	}
}

class Node <T>{
	T data;
	Node<T> next;
	
	Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	@Override
	public String toString() {
		return "Node data -> " + this.data;
	}
}
