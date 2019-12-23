package com.company.algorithms.staks.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

	private LinkedList<Employee> stack;

	public LinkedStack() {
		stack = new LinkedList<>();
	}

	// head of the list
	public void push(Employee employee) {
		stack.push(employee);
	}

	//remove from the head of the list
	public Employee pop() {
		return stack.pop();
	}

	//We just return the head of the list
	public Employee peek() {
		return stack.peek();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
