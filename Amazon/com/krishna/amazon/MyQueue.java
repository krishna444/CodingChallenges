package com.krishna.amazon;

/**
 * Queue implementation
 * 
 * @author krishna
 *
 */
public class MyQueue {
	private LinkNode front;

	private LinkNode rear;

	public MyQueue() {

	}

	public void enqueue(int value) {
		if (this.front == null) {
			LinkNode node = new LinkNode(value);
			this.front = this.rear = node;
			//this.rear = node;

		} else {
			LinkNode node = new LinkNode(value);
			this.rear.next = node;
			this.rear = node;
		}
	}

	public int dequeue() throws Exception {
		if (this.front == null)
			throw new Exception("Empty Queue");
		int value = this.front.value;
		this.front = this.front.next;
		return value;
	}

	public int peek() throws Exception {
		if (this.front == null)
			throw new Exception("List if EMPTY");
		return this.front.value;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("[");
		LinkNode node = this.front;
		while (node != null) {
			stringBuilder.append(node.value);
			node = node.next;
			if (node != null) {
				stringBuilder.append(" ");
			}
		}
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
