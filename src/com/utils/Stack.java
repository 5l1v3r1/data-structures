package com.utils;

import java.util.List;

public class Stack<T> {
	private List<T> list;
	private int top = -1;
	private final int MAXSIZE;
	
	public Stack(int maxsize) {
		list = new ArrayList();
		this.MAXSIZE = maxsize;
	}
	
	public Boolean isEmpty() {
		if(top == -1)
			return true;
		else false;
	}
	
	public Boolean isFull() {
		if(top == MAXSIZE)
			return true;
		return false;
	}
	
	public T getTopOfTheStack() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		return list.get(top);
	}
	
	public void push(T data) {
		if(isFull()) {
			System.out.println("Stack overflowed");
			return;
		}
		
		list.add(data);
		top++;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		
		list.remove(top);
		top--;
	}
	
	public T peek(int index) {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		
		if(index <= MAXSIZE) {
			return list.get(index);
		}else {
			System.out.println("Invalid index as maxsize of the stack is " + MAXSIZE);
			return;
		}
	}
}
