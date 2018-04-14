import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static int pathGrowingAlgorithm(Graph g) {

        // Creating the objects of the graph to add heaviest edges in m1 and m2
        Graph m1 = new Graph();
        Graph m2 = new Graph();

        int i = 1;

        // E not equals to zero

        while (g.getEdges().size() > 0) {

            //arbitary selection of the vertex
            Integer random = g.getVertices().get(new Random().nextInt(g.getVertices().size()));
            System.out.println("Random vertex " + random);

            int kVertex = random;

            //Vertex degree should be at least one

            while (g.getVertexWeight(kVertex) > 0) {


                int secondVertex;

                // Finding heaviest

                int f = g.getHeaviestEdge(kVertex);

                // logic for moving on the second vertex

                if (g.getEdges().get(f).getVertexOne() == kVertex) {

                    secondVertex = g.getEdges().get(f).getVertexTwo();
                } else {

                    secondVertex = g.getEdges().get(f).getVertexOne();
                }

                System.out.println("second vertex " + secondVertex);

                // Adding the heaviest edge to M1 or M2

                if (i == 1) {
                    m1.getEdges().add(g.getEdges().get(f));
                } else {

                    m2.getEdges().add(g.getEdges().get(f));
                }

                i = 3 - i;
                // Removing the vertex
                g.remove(kVertex);

                kVertex = secondVertex;

            }


        }


        System.out.println(" M1 has total of weight of " + m1.weight() + " with number of edges " + m1.getEdges().size());
        System.out.println(" M2 has total of weight of " + m2.weight() + " with number of edges " + m2.getEdges().size());


        return Math.max(m1.weight(), m2.weight());


    }


    public static void main(String[] args) {
        Graph graph;

        ArrayList<Edge> edges = new ArrayList<>();

        //Check the summary n the end for the graph diagram

        edges.add(new Edge(5, 1, 2));
        edges.add(new Edge(2, 2, 3));
        edges.add(new Edge(1, 2, 4));
        edges.add(new Edge(6, 3, 4));
        edges.add(new Edge(3, 4, 5));
        edges.add(new Edge(4, 5, 1));


        graph = new Graph(edges, 5);

        System.out.println("The maximum weighted matching using the Path growing algorithm is " + pathGrowingAlgorithm(graph));
    }

}
