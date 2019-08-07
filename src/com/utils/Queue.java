package com.utils;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
	private List<T> list;
	private int head;
	private int tail;
	private final int MAXSIZE;
	
	public Queue(int maxsize) {
		list = new ArrayList<>();
		this.MAXSIZE = maxsize;
		head = 0; 
		tail = -1;
	}
	
	private Boolean isEmpty() {
		if(head > tail) {
			System.out.println("Queue is empty");
			return true;
		}		
		return false;
	}
	
	private Boolean isFull() {
		if(tail == MAXSIZE-1) {
			System.out.println("Queue overflowed");
			return true;
		}
		return false;
	}
	
	public void enqueue(T data) {
		if(!isFull()) {
			list.add(data);
			tail++;
		}
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			list.remove(0); //Remove element from the front of the queue
			head++;
		}
	}
	
	public T peek(int index) {
		if(!isEmpty()) {
			if(index <= tail && index >= head) {
				return list.get(index - head);
			} else {
				System.out.println("No element found");
			}
		}
		return null;
	}
}
