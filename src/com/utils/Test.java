package com.utils;

public class Test {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.insertAtEnd("abc");
		list.insertAtEnd("iui");
		list.insertAtEnd("iioi");
		list.insertAtBeginning("90");
		list.insertAfter("iui", "jio");
		System.out.println(list);
		list.removeAt(3);
		System.out.println(list);
	}
}
