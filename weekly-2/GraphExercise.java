import java.util.List;

public class GraphExercise {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[][] graphAsArray = {
            //a   b   c   d
             {0, 20, 42, 35}, // a
             {20, 0, 30, -1}, // b
             {42, 30, 0, 12}, // c
             {35, -1, 12, 0}  // d
        };
        Graph graph1 = new Graph(graphAsArray);
        List<Node> NodeList = graph1.getNodes();
        for (Node node : NodeList) {
            System.out.println(node);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

    // public Gra
}
