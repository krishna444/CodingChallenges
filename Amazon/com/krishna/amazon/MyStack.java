package com.krishna.amazon;

public class MyStack {
	private LinkNode top;

	// Operations
	public void push(int value) {
		LinkNode node = new LinkNode(value);
		// Check for empty stack
		if (top == null) {
			this.top = node;
		} else {
			node.next = top;
			this.top = node;
		}

	}

	public int pop() throws Exception {
		if (top == null)
			throw new Exception("Stack is empty");

		int value = this.top.value;
		this.top = this.top.next;
		return value;

	}

	public int peek() throws Exception {
		if (top == null)
			throw new Exception("Stack is empty");
		return this.top.value;
	}
	
	
}

