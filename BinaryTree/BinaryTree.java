import LinkedList.List;
public class BinaryTree {
	
	private Node root; // Top-most node.

	public class Node {
		
		private int value;
		private Node left;
		private Node right;

		public Node() {
			// Initializes a node with a value 1 - 30.
			this.value = (int) (1 + 30 * Math.random()); 
		}
	}
	
	public void generateTree(int num) {
		
		List list = new List(num);
		list.generateList();
		

	}

	
	
}

