package com.utils;

public class LinkedList <T> {	
	Node<T> head = null;
	
	public void insertAtBeginning(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAfter(T data, T newData) {
		Node<T> newNode = new Node<T>(newData);
		
		Node<T> temp = head;
		while(temp.data != data) {
			System.out.println("temp: " + temp);
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node<T> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	@Override
	public String toString() {
		String str = head.toString();
		Node<T> temp = head;
		while(temp.next != null) {
			temp = temp.next;
			str = str + " " + temp;
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
