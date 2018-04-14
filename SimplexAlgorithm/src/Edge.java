public class Edge {

//This class represents edge with vertex one , vertex two and weight of the edge.

    private int vertexOne;
    private int vertexTwo;
    private int weight;

    // Getters and setters for vertexOne, vertexTwo and weight

    public int getVertexOne() {
        return vertexOne;
    }

    public void setVertexOne(int vertexOne) {
        this.vertexOne = vertexOne;
    }

    public int getVertexTwo() {
        return vertexTwo;
    }

    public void setVertexTwo(int vertexTwo) {
        this.vertexTwo = vertexTwo;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Edge( int weight,int vertexOne, int vertexTwo) {
        this.vertexOne = vertexOne;
        this.vertexTwo = vertexTwo;
        this.weight = weight;
    }


    @Override
    public boolean equals(Object obj) {
        Edge e=(Edge) obj;
        return ((e.getVertexOne()==this.getVertexOne()||e.getVertexOne()==this.getVertexTwo()) &&
                (e.getVertexTwo()==this.getVertexOne()||e.getVertexTwo()==this.getVertexTwo()));
    }


}

