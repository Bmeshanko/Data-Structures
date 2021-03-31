public class DoubleLinkedList {
	
	private DoubleNode head;
	private DoubleNode tail;
	private int length;

	public class DoubleNode {
		private int value;
		private DoubleNode next;
		private DoubleNode prev;

		public DoubleNode() {
			this.value = (int) (1 + 30 * Math.random());
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}
	}

	public void generateList(int length) {
		Node head = new Node();

		this.head = head;
		this.length = length;

		for (int i = 0; i < length; i++) {
			Node newNode = new Node();
			Node traverse = this.head;
			
			if (this.head.next == null) {
				head.next = newNode;
				newNode.prev = head;
			}

			while (traverse.next != null) {
				traverse = traverse.next;
			}

			traverse.next = newNode;
			newNode.prev = traverse;

			if (i == length - 1) {
				this.tail = newNode;
			}
		}
	}

	public String forwardString() {
		Node traverse = this.head;
		String s = "";
		for (int i = 0; i < this.length; i++) {
			if (i < length - 1) {
				s += traverse.value + " -> ";
			} else {
				s += traverse.value;
			}
			traverse = traverse.next;
		}
		return s;
	}

	public String backwardString() {
		Node traverse = this.tail;
		String s = "";
		for (int i = 0; i < this.length; i++) {
			if (i < length - 1) {
				s += traverse.value + " -> ";
			} else {
				s += traverse.value;
			}
			traverse = traverse.prev;
		}
		return s;
	}
}
