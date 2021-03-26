public class BinaryTree {
	
	private Node root; // Top-most node.

	public class Node {
		
		private int value;
		private Node left;
		private Node right;

		public Node() {
			// Initializes a node with a value 1 - 30.
			this.value = (int) (1 + 30 * Math.random());
			this.left = null;
			this.right = null;
		}
	}
	
	public void generateTree(int num) {
		
		// Initialize a Node[] to store
		// The Nodes.
		Node[] nodes = new Node[num];
		
		for (int i = 0; i < num; i++) {
			nodes[i] = new Node();
		}
		
		// Just put in the Nodes in order, the tree isn't balanced.
		// This will be done iteratively.

		this.root = nodes[0];

		for (int i = 1; i < num; i++) {
			// Right Side
			if (nodes[i].value > this.root.value) {

				if (this.root.right == null) {
					this.root.right = nodes[i];
				} else {
					Node traverse = this.root;

					while (traverse.right != null && nodes[i].value > traverse.value) {
						traverse = traverse.right;
					}

					if (nodes[i].value > traverse.value) {
						traverse.right = nodes[i];
					} else {
						traverse.left = nodes[i];
					}
				}
			// Left Side
			} else {

				if (this.root.left == null) {
					this.root.left = nodes[i];
				} else {
					Node traverse = this.root;

					while (traverse.left != null && nodes[i].value < traverse.value) {
						traverse = traverse.left;
					}

					if (nodes[i].value > traverse.value) {
						traverse.right = nodes[i];
					} else {
						traverse.left = nodes[i];
					}
				}
			}
		}
	}
	
	public static String preOrder(Node root, String s) {
		
		if (root == null) return s;

		System.out.println(root.value);

		preOrder(root.left, s);

		preOrder(root.right, s);

		return s;
	}

	public static void main(String[] args) {
		String s = "";
		BinaryTree tree = new BinaryTree();
		tree.generateTree(10);

		s = preOrder(tree.root, s);
		System.out.println(s);
	}

}

