import java.util.HashMap;
import java.util.Map;

public class Node {

    private int id;
    private Map<Node, Integer> distances = new HashMap<>();
    
    public Node(int id) {
        this.id = id;
    }
    
    public Node(int id, Node otherNode, int distance) {
        this.id = id;
        addNodeDistance(otherNode, distance);
    }

    public int getId() {
        return id;
    }

    public Map<Node, Integer> getDistances() {
        return distances;
    }

    public int getDistance (Node node) {
        return distances.get(node);
    }

    public void addNodeDistance(Node otherNode, int distance) {
        this.distances.put(otherNode, distance);
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.valueOf(this.id) + " -> [");
        
        for (Integer distance : distances.values()) {
            output.append(String.valueOf(distance) + ", ");
        }
        output.setLength(output.length() - 2);
        
        output.append("]\n");

        return output.toString();
    }

}
