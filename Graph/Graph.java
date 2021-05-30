import java.util.ArrayList;

public class Graph {
	
	private boolean[][] connections;
	private int nodes;

	public Graph(int nodes) {
		this.nodes = nodes;
		
		// Initialize the array of connections:
		this.connections = new boolean[nodes][nodes];
	}
	
	public void oneWayEdge(int from, int to) {
		this.connections[from][to] = true;
	}

	public void twoWayEdge(int node1, int node2) {
		this.connections[node1][node2] = true;
		this.connections[node2][node1] = true;
	}

	public void randomizeConnections() {
		
		for (int i = 0; i < this.nodes; i++) {
			for (int j = i; j < this.nodes; j++) {
				
				double random = Math.random();
				if (random < 0.5 && i != j) {
					this.connections[i][j] = true
					this.connections[j][i] = true;
				} else {
					this.connections[i][j] = false;
					this.connections[j][i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.randomizeConnections();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (graph.connections[i][j]) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}
