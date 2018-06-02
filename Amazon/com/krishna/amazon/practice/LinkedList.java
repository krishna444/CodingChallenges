package com.krishna.amazon.practice;

import java.util.HashSet;

import com.krishna.amazon.LinkNode;

public class LinkedList {
	private static LinkNode removeDups(LinkNode head) {
		LinkNode node = head;
		LinkNode previous = null;
		HashSet<Integer> hashSet = new HashSet<Integer>();
		while (node != null) {
			if (hashSet.contains(node.value)) {
				previous.next = node.next;
			} else {
				hashSet.add(node.value);
				previous = node;
			}
			node = node.next;
		}
		return node;
	}

	public static void main(String... args) {
		com.krishna.amazon.LinkedList linkedList = new com.krishna.amazon.LinkedList(new int[] { 12, 45, 78,45 });
		removeDups(linkedList.head);
		System.out.println(linkedList.toString());
	}
}
