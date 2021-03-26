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

	
	
}
