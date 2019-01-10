import java.util.Arrays;

public class BinarySearchTree {
	private BTNode root;

	public BinarySearchTree(LinkNode linkNode) {
		while (linkNode != null) {
			if (this.root == null) {
				this.root = new BTNode(linkNode.value);
			} else {
				this.insert(linkNode.value);
			}
			linkNode = linkNode.next;
		}
	}

	public void insert(int value) {
		this.insert(root, value);
	}

	private BTNode insert(BTNode node, int value) {
		if (node == null) {
			return new BTNode(value);
		} else {
			if (value < node.value) {
				node.left = insert(node.left, value);
			} else {
				node.right = insert(node.right, value);
			}
		}
		return node;
	}

	public String preOrder(BTNode node) {
		if (node == null)
			return "";
		return node.value + " " + preOrder(node.left) + " " + preOrder(node.right);
	}

	public String inOrder(BTNode node) {
		if (node == null)
			return "";
		return inOrder(node.left) + " " + node.value + " " + inOrder(node.right);
	}

	public String postOrder(BTNode node) {
		if (node == null)
			return "";
		return postOrder(node.left) + " " + postOrder(node.right) + " " + node.value;
	}

	public LinkedList createLinkedList() {
		return createLinkedList(this.root, new LinkedList());

	}

	private LinkedList createLinkedList(BTNode node, LinkedList accumulator) {
		if (node == null)
			return accumulator;		
		createLinkedList(node.left, accumulator);
		accumulator.insertLast(node.value);
		return createLinkedList(node.right, accumulator);

	}

	@Override
	public String toString() {
		return inOrder(this.root).trim();
	}

	public static void main(String... args) {
		LinkedList linkedList = new LinkedList(new int[] {100, 2, 76,12, 34, -100 });
		BinarySearchTree searchTree = new BinarySearchTree(linkedList.head);
		System.out.println(searchTree.toString());
		System.out.println(searchTree.preOrder(searchTree.root).trim());
		System.out.println(searchTree.postOrder(searchTree.root).trim());
		System.out.println(searchTree.createLinkedList());
		System.out.println(Arrays.toString(searchTree.createLinkedList().toArray()));

	}
}
