package com.utils;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	private List<T> list;
	private int top;
	private final int MAXSIZE;
	
	public Stack(int maxsize) {
		list = new ArrayList<T>();
		top = -1;
		this.MAXSIZE = maxsize;
	}
	
	private Boolean isEmpty() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return true;
		}
		return false;
	}
	
	private Boolean isFull() {
		if(top == MAXSIZE-1) {
			System.out.println("Stack overflowed");
			return true;
		}
		return false;
	}
	
	public void push(T data) {
		if(!isFull()) {
			list.add(data);
			top++;
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			list.remove(top);
			top--;
		}
	}
	
	public T peek(int index) {
		if(!isEmpty()) {
			if(index <= top) {
				return list.get(top - index);
			}else {
				System.out.println("Invalid index");
				return null;
			}
		}
		return null;
	}
}
