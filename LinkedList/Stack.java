public class Stack extends List {

	private Node head;
	private int length;


	public void generateList(int length) {
		super.generateList(length);
	}

	public void add(Node node) {
		this.length++;

		node.next = this.head;
		this.head = node;
	}

	public Node remove() {
		this.length--;

		Node node = this.head;
		this.head = this.head.next;

		return node;
	}
}
