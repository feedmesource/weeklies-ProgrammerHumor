import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Node> nodes = new ArrayList<>();
    
    public Graph(int[][] graphArray) {
        int receivingNodeID = 0;
        int originalNodeID = 0;
        for (int[] row : graphArray) {
            for (int distance : row) {
                if (!checkIfNodeInNodesList(originalNodeID)) {
                    Node originalNode = new Node(originalNodeID);
                    nodes.add(originalNode);

                    Node receivingNode;
                    if (!checkIfNodeInNodesList(receivingNodeID)) {
                        receivingNode = new Node(receivingNodeID);
                    } else {
                        receivingNode = getNodeByID(receivingNodeID);
                    }
                    originalNode.addNodeDistance(receivingNode, distance);
                    receivingNode.addNodeDistance(originalNode, distance);
                } else {
                    Node originalNode = getNodeByID(originalNodeID);
                    Node receivingNode = getNodeByID(receivingNodeID);
                    originalNode.addNodeDistance(receivingNode, distance);
                }
                originalNodeID++;
            }
            originalNodeID = 0;
            receivingNodeID++;
        }
    }

    public List<Node> getNodes() {
        return nodes;
    }

    private boolean checkIfNodeInNodesList (int idToCheck) {
        for (Node node : this.nodes) {
            if (node.getId() == idToCheck) return true;
        }
        return false;
    }

    Node getNodeByID(int idToCheck) {
        for (Node node : this.nodes) {
            if (node.getId == idToCheck) return node;
        }
        return null;
    }
}
