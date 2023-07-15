import java.util.HashMap;
import java.util.Map;

public class Node {

    private String charName;
    private int id;
    private Map<Node, Integer> distances = new HashMap<>();

    public Node(int id) {
        this.id = id;
        this.charName = toAlphabetic(id);
    }
    
    public Node(int id, Node otherNode, int distance) {
        this.id = id;
        this.charName = toAlphabetic(id);
        addNodeDistance(otherNode, distance);
    }

    public int getId() {
        return id;
    }

    public String getCharName() {
        return charName;
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

    public static String toAlphabetic(int i) {
        if( i<0 ) {
            return "-"+toAlphabetic(-i-1);
        }
    
        int quot = i/26;
        int rem = i%26;
        char letter = (char)((int)'A' + rem);
        if( quot == 0 ) {
            return ""+letter;
        } else {
            return toAlphabetic(quot-1) + letter;
        }
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
