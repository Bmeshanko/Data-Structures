public class List {
	
	private Node head;
	private int length;
	
	/* 
	 * Node Class: Defines a Single Node in the Linked List.
	 * */
	public class Node {
		
		private Node next;
		private Node prev;
		private int value;
		
		
		// Chooses a random value 1 - 10 to be the Node's value.
		public Node() {	
			value = (int) (1 + 10 * Math.random());
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public void setPrev(Node next) {
			this.prev = prev;
		}
	}
	
	public List generateList(int length) {
		List list = new List();
		
		Node head = new Node();
		
		list.head = head;
		list.length = length;
		
		for (int i = 1; i < length; i++) {
			Node newNode = new Node();
			Node traverse = head;
			
			if (head.next == null) {
				head.next = newNode;
			}
			
			while (traverse.next != null) {
				traverse = traverse.next;
			}
			
			traverse.next = newNode;
		}
		
		return list;
	}
	
}