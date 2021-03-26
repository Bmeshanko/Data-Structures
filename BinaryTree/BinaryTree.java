public class BinaryTree {
	
	private Node[] nodes; // All the nodes in the tree.
	private Node root;
	private String output; // The info is stored in a String, and printed.
	public class Node {
		
		private int value;
		private Node left;
		private Node right;
		private Node parent;

		public Node() {
			// Initializes a node with a value 1 - 30.
			this.value = (int) (1 + 30 * Math.random());
			this.left = null;
			this.right = null;
		}
	}
	
	public void initializeTree(int num) {
		
		// Initialize a Node[] to store
		// The Nodes.
		Node[] nodes = new Node[num];
		for (int i = 0; i < num; i++) {
			nodes[i] = new Node();
			System.out.println(nodes[i].value);
		}

		// Sort the Tree, needed to create a balanced tree.
		// Here, we are using Bubble Sort to sort the nodes.
		
		for (int i = 0; i < nodes.length - 1; i++) {
			for (int j = 0; j < nodes.length - i - 1; j++) {
				if (nodes[j].value > nodes[j + 1].value) {
					Node temp = nodes[j];
					nodes[j] = nodes[j + 1];
					nodes[j + 1] = temp;
				}
			}
		}
		
		this.nodes = nodes;
	}

	public void constructTree(int lower, int upper, Node root) {
		int middle = (lower + upper) / 2;

		if (middle == lower) return;

		root = this.nodes[middle - 1];

		root.right = new Node();
		root.right.parent = root;
		
		root.left = new Node();
		root.left.parent = root;

		constructTree(lower, middle, root.left);
		

		if (upper - lower == 2) return;

		constructTree(1 + middle, upper, root.right);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.initializeTree(7);
		tree.constructTree(1, 8, null);
		
	}

}

