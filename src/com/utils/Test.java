package com.utils;

public class Test {
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>(4);
		q.enqueue(7);
		q.enqueue(9);
		q.enqueue(33);
		q.enqueue(90);
		q.dequeue();
		q.dequeue();
		System.out.println(q.peek(1));
	}
}
