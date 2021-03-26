package LinkedList; 
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
			value = (int) (1 + 30 * Math.random());
		}
		
		public void setNext(Node next) {
			this.next = next;
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
			Node traverse = head;
			

			// head needs to be fully defined before we can traverse
			// through the list iteratively.
			if (head.next == null) {
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
		Node traverse = head;
		String s = "";
		for (int i = 0; i < length; i++) {
			if (i < length - 1)
				s += traverse.value + " -> "; // Example: 5 -> 3 -> 4, shows link.
			else
				s += traverse.value;
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
	
	public static void main(String[] args) {
		List list = new List();
		list.generateList(10);
		
		System.out.println(list);
		System.out.println(list.sortList());
	}
}
