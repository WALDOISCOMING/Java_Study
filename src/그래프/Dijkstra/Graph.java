package �׷���.Dijkstra;

import java.util.*;

public class Graph {
	private Set<Node> nodes = new HashSet<>();
    
    public Set<Node> getNodes() {
		return nodes;
	}

	public void setNodes(Set<Node> nodes) {
		this.nodes = nodes;
	}


    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }
 
}
