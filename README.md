# A-Simple-Approximation-Algorithm-for-Weighted-Matching-Problem

## This is algorithm implemented from the paper. This is implemented in java language. This is simple java implementation and can be improved further.

A graph is a made up of Edges and Vertices. The code uses Edge class to represent
the edges between the nodes in a graph.
The Edge class has following functions:
* setWeight () to set the edge weight between vertices.
* getWeight () to get the edge weight.
* Constructor () which takes in edge weight, vertex 1 and vertex 2 as parameter.
* getVertexOne () and getVertexTwo () to get the respective vertex.
* setVertexOne () and setVertexTwo () to set the respective vertex.
The Graph class has following functions:
* getEdge () and setEdges () to get and set the edges respectively.
* getVertices and setVertices to get and set the vertices respectively.
* Graph () constructor which takes in parameter the number of vertices and an
array list of edges.
* getHeaviestEdge () to get the edge incident to the vertex which has the highest
edge weight.
* getVertexWeight () to get degree of vertex.
* weight () calculates the weight of M1 and M2.
* remove () deletes the vertex and incident edges.
The Main class:
* pathGrowingAlgorithm () to implement the algorithm.
