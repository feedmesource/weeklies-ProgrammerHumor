import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphExercise {

    private static List<Node> nodeList;
    private static Graph exampleGraph;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // start timer

        exampleGraph = createExampleGraph();
        // nodeList = graph1.getNodes();

        // for (Node node : nodeList) {
        //     System.out.println(node);
        // }

        GraphExercise exercise = new GraphExercise();
        int easyAnswer = exercise.difficultyEasy(exampleGraph, new String[]{"B", "D"});
        System.out.println(easyAnswer);

        long endTime = System.currentTimeMillis(); // end timer
        System.out.println("That took " + (endTime - startTime) + " milliseconds"); // timer result

        exampleGraph = createExampleGraph();
        // GraphExercise exercise = new GraphExercise();
        List<Object> intermediateAnswer = exercise.difficultyIntermediate(exampleGraph, new String[]{"B", "D"});

        System.out.println(intermediateAnswer.get(0));
        System.out.println(intermediateAnswer.get(1));

        long endTime2 = System.currentTimeMillis(); // end timer 2
        System.out.println("That took " + (endTime2 - endTime) + " milliseconds"); // timer result 2
    }

    private static Graph createExampleGraph() {
        int[][] graphAsArray = {
            //a   b   c   d
             {0, 20, 42, 35}, // a
             {20, 0, 30, -1}, // b
             {42, 30, 0, 12}, // c
             {35, -1, 12, 0}  // d
        };
        return new Graph(graphAsArray);
    }

    public int difficultyEasy(Graph graph, String[] startAndEnd) {
        nodeList = graph.getNodes();
        Node sourceNode = graph.getNodeByChar(startAndEnd[0]);
        Node targetNode = graph.getNodeByChar(startAndEnd[1]);
        Map<Node, Double> shortestDistances = Dijkstra(nodeList, sourceNode);
        Double distanceWeNeed = shortestDistances.get(targetNode);
        return distanceWeNeed.intValue();
    }

    public List<Object> difficultyIntermediate(Graph graph, String[] startAndEnd) {
        nodeList = graph.getNodes();
        Node sourceNode = graph.getNodeByChar(startAndEnd[0]);
        Node targetNode = graph.getNodeByChar(startAndEnd[1]);
        Map<Node, Double> shortestDistances = Dijkstra2(nodeList, sourceNode);
        Double distanceWeNeed = shortestDistances.get(targetNode);
        Integer distanceWeNeedInt = distanceWeNeed.intValue();

        StringBuilder sb = new StringBuilder();

        Node currentNode = targetNode;
        while (currentNode.getPathFrom() != null) {
            sb.insert(0, "," + currentNode.getCharName());
            currentNode = currentNode.getPathFrom();
        }
        sb.delete(0, 1);

        String nodesTravelled = sb.toString();

        List<Object> outputs = Arrays.asList(nodesTravelled, distanceWeNeedInt);
        return outputs;
    }

    public Map<Node, Double> Dijkstra (List<Node> nodeList, Node sourceNode) {
        Set<Node> usedNodes = new HashSet<>();
        Map<Node, Double> distances = new HashMap<>();

        for (Node node : nodeList) {
            if (node.equals(sourceNode)) {
                distances.put(node, 0.0);
            } else {
                distances.put(node, Double.POSITIVE_INFINITY);
            }
        }

        while (nodeList.size() > 0) {
            Node smallest = getSmallest(nodeList, usedNodes, distances);
            nodeList.remove(smallest);
            usedNodes.add(smallest);

            Map<Node, Integer> neighbours = smallest.getDistances();
            for (Node neighbour : neighbours.keySet()) {
                Double newValue = distances.get(smallest) + smallest.getDistance(neighbour);
                if (newValue < distances.get(neighbour)) {
                    distances.put(neighbour, newValue);
                }
            }
        }

        // // for printing out distances
        // for (Map.Entry<Node, Double> entry : distances.entrySet()) {
        //     System.out.println(entry.getKey().getId() + " " +  entry.getValue());
        // }
        
        return distances;
    }

    public Map<Node, Double> Dijkstra2 (List<Node> nodeList, Node sourceNode) {
        Set<Node> usedNodes = new HashSet<>();
        Map<Node, Double> distances = new HashMap<>();

        for (Node node : nodeList) {
            if (node.equals(sourceNode)) {
                distances.put(node, 0.0);
            } else {
                distances.put(node, Double.POSITIVE_INFINITY);
            }
        }

        while (nodeList.size() > 0) {
            Node smallest = getSmallest(nodeList, usedNodes, distances);
            nodeList.remove(smallest);
            usedNodes.add(smallest);

            Map<Node, Integer> neighbours = smallest.getDistances();
            for (Node neighbour : neighbours.keySet()) {
                Double newValue = distances.get(smallest) + smallest.getDistance(neighbour);
                if (newValue < distances.get(neighbour)) {
                    distances.put(neighbour, newValue);
                    neighbour.setPathFrom(smallest);
                }
            }
        }

        // // for printing out distances
        // for (Map.Entry<Node, Double> entry : distances.entrySet()) {
        //     System.out.println(entry.getKey().getId() + " " +  entry.getValue());
        // }
        
        return distances;
    }

    private Node getSmallest(List<Node> nodeList, Set<Node> usedNodes, Map<Node, Double> distances) {
        Node smallest = null;
        for (Node node : nodeList) {
            if (usedNodes.contains(node)) {
                continue;
            }

            if (smallest == null) {
                smallest = node;
            } else if (distances.get(node) < distances.get(smallest)) {
                smallest = node;
            }
        }
        return smallest;
    }
}
