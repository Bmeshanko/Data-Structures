public class List {
	
	private Node head;
	private int length;
	
	/* 
	 * Node Class: Defines a Single Node in the Linked List.
	 */
	public class Node {
		
		private Node next;
		private int value;
		
		
		// Chooses a random value 1 - 30 to be the Node's value.
		public Node() {	
			this.value = (int) (1 + 30 * Math.random());
		}
		
		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return this.value;
		}
	}
        
	/* 
	 * When a new list is initialized, it has all null parameters. This
	 * method gives the List a head, a length (defined by user input) and
	 * all of the nodes that have random values 1-30.
	 */
	public void generateList(int length) {
		Node head = new Node();
		
		this.head = head;
		this.length = length;
		
		for (int i = 0; i < length; i++) {
			Node newNode = new Node();
			Node traverse = this.head;
			

			// head needs to be fully defined before we can traverse
			// through the list iteratively.
			if (this.head.next == null) {
				head.next = newNode;
			}
			
			while (traverse.next != null) {
				traverse = traverse.next;
			}
			
			traverse.next = newNode;
			newNode.next = null;
		}
	}
	
	public String toString() {
		Node traverse = this.head;
		String s = "";
		for (int i = 0; i < this.length; i++) {
			if (i < length - 1) {
				s += traverse.value + " -> "; // Example: 5 -> 3 -> 4, shows link.
			} else {
				s += traverse.value;
			}
			traverse = traverse.next;
		}
		return s;
	}
	
	
	/* 
	 * Insertion Sort: create a new List, then insert the nodes in order.
	 */
	public List sortList() {
		Node currList = this.head;
		List sortList = new List();
		sortList.length = this.length;
		
		while (currList != null && currList.next != null) {
			Node newNode = new Node();
			newNode.value = currList.value;
			
			currList = currList.next;

			if (sortList.head == null) {
				sortList.head = newNode;
			} else {
				Node traverse = sortList.head;
				if (newNode.value >= sortList.head.value) {
					int temp = sortList.head.value;
					sortList.head.value = newNode.value;
					newNode.value = temp;
					
					newNode.next = sortList.head.next;
					sortList.head.next = newNode;
				} else {
					while (traverse.next != null && newNode.value < traverse.next.value) {
						traverse = traverse.next;
					}
					newNode.next = traverse.next;
					traverse.next = newNode;
				}
			}
		}
		return sortList;
	}

	public void stackNode(Node node) {
		// In a Stack, Nodes are added to the top.
		this.length++;

		node.next = this.head;
		this.head = node;
	}

	public Node get(int position) {
		
		Node traverse = this.head;

		try {
			if (position > this.length) {
				throw new IndexException
					("Index Exception. Tried to access element " + position + " for a List of length " + this.length);
			}

			for (int i = 0; i < position; i++) {
				traverse = traverse.next;
			}

		} catch (IndexException e) {
			e.printStackTrace();
			return null;
		}
		return traverse;
	}

	public void queueNode(Node node) {
		// In a Queue, Nodes are added to the end.
		this.length++;
		
		Node traverse = this.head;
		while (traverse.next != null) {
			traverse = traverse.next;
		}

		traverse.next = node;
	}

	public Node pop() {
		this.length--;

		Node temp = this.head;
		this.head = this.head.next;

		return temp;
	}

	public static void main(String[] args) {
		List list = new List();
		list.generateList(20);
		
		System.out.println(list.get(19).getValue());
		System.out.println(list.get(21).getValue());
	}
}
