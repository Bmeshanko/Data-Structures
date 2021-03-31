public class Queue extends List {
	
	private Node head;
	private int length;

	public void generateList(int length) {
		super.generateList(length);
	}

	public void add(Node node) {
		super.queueNode(node);
	}

	public Node remove() {
		this.length--;

		Node node = this.head;
		this.head = this.head.getNext();

		return node;
	}
}

