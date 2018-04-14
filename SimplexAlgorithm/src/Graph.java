import java.util.ArrayList;

public class Graph {


    private ArrayList<Edge> edges = new ArrayList<>();
    private ArrayList<Integer> vertices = new ArrayList<>();


    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public ArrayList<Integer> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Integer> vertices) {
        this.vertices = vertices;
    }


    // Constructor for Graph
    public Graph() {
    }

    public Graph(ArrayList<Edge> edges, int noOfVertices) {


        this.edges = edges;

        for (int i = 1; i <= noOfVertices; i++) {

            vertices.add(i);

        }


    }

    //To get the degree of vertex

    public int getVertexWeight(int vertex) {


        int cpt = 0;
        for (Edge edge : this.getEdges()) {


            if (edge.getVertexOne() == vertex || edge.getVertexTwo() == vertex) {

                cpt++;
            }

        }

        return (cpt);

    }


    // To find the Heaviest edge on the given vertex

    public int getHeaviestEdge(int vertex) {

        int k = -1;

        for (int i = 0; i < this.getEdges().size(); i++) {

            if (this.getEdges().get(i).getVertexOne() == vertex || this.getEdges().get(i).getVertexTwo() == vertex) {


                if (k == -1) {

                    k = i;
                } else {

                    if (this.getEdges().get(i).getWeight() >= this.getEdges().get(k).getWeight()) {

                        k = i;

                    }
                }

            }

        }
        return k;

    }



    // To calculate the total weight of the edges in the given graph.

    public int weight() {


        int cpt = 0;

        for (Edge edge : this.getEdges()) {


            cpt += edge.getWeight();

        }

        return cpt;


    }


    // To remove the edge from the graph.

    public void remove(int vertex) {


        for (int i = 0; i < this.getEdges().size(); i++) {


            if ((edges.get(i).getVertexOne() == vertex || edges.get(i).getVertexTwo() == vertex)) {


                this.getEdges().remove(this.getEdges().get(i));

                i--;


            }

        }


        this.getVertices().remove(this.getVertices().indexOf(vertex));


    }




}
