package com.krishna.amazon;

public class LinkedList {
	public LinkNode head;
	public LinkNode last;

	public LinkedList() {
		this(new int[] {});
	}

	public LinkedList(int[] intArray) {
		LinkNode last = null;
		for (int value : intArray) {
			LinkNode node = new LinkNode(value);
			if (last == null) {
				head = last = node;
			} else {
				last.next = node;
				last = node;
			}
		}
	}

	public void insertFirst(int value) {
		LinkNode node = new LinkNode(value);
		node.next = head;
		head = node;
	}

	public void insertLast(int value) {
		LinkNode node = new LinkNode(value);
		if (last == null)
			head = last = node;
		else {
			last.next = node;
			last = node;
		}
	}

	/**
	 * Deletes a first matched value from the linked list
	 * 
	 * @param value
	 *            Value to be deleted
	 */
	public void delete(int value) {
		LinkNode node = head;
		LinkNode previous = null;
		while (node != null) {
			if (node.value == value) {
				if (node == head) {
					head = head.next;
				} else {
					previous.next = node.next;
				}
			}
			previous = node;
			node = node.next;
		}
	}

	public int[] toArray() {
		int count = count(this.head, 0);
		int[] array = new int[count];
		LinkNode node = this.head;
		int i = 0;
		while (node != null) {
			array[i++] = node.value;
			node = node.next;
		}
		return array;
	}

	private int count(LinkNode node, int count) {
		if (node == null)
			return count;
		return count(node.next, count + 1);

	}

	@Override
	public String toString() {
		LinkNode node = head;
		StringBuilder string = new StringBuilder();
		while (node != null) {
			string.append(node.value);
			node = node.next;
			if (node != null) {
				string.append("->");
			}
		}
		return string.toString();
	}

}
