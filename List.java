public class List {
	
	private Node head;
	
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
	
}