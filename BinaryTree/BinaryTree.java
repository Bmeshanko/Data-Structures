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
				
				if (root.right == null) {
					root.right = nodes[i];
				} else {
					Node traverse = root;

					while (traverse.right != null && nodes[i].value > traverse.value) {
						traverse = traverse -> right;
					}

					if (nodes[i].value > traverse.value) {
						traverse.right = nodes[i];
					} else {
						traverse.left = nodes[i];
					}
				}
			// Left Side
			} else {

				if (root.left == null) {
					root.left = nodes[i];
				} else {
					Node traverse = root;

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

	

}

