import java.util.*;

public class Adjacenylist {

    // We will define a class for the edge 
    static class Edge {
        int src;
        int dest;
        int wt;

    

    // Constructor for the same 
    public Edge (int src, int dest, int weight)
    {
        this.src=src;
        this.dest=dest;
        int wt=weight;
    }

    }


    public static void main(String args[])
    {

    // We will have the count of vertices

    int V=5;

    // Using array of array  list we will construct the graph 

    ArrayList<Edge> [] graph = new ArrayList[V];    // null array list means it has empty values 

    for(int i=0;i<V; i++)
    {
        graph[i]= new ArrayList<>();
    }


    // 0 vertex 
    graph[0].add(new Edge(0,1,5));

     // 1 vertex 
    graph[1].add(new Edge(1,0,5)); 
    graph[1].add(new Edge(1,2,1));
    graph[1].add(new Edge(1,3,3));

    // 2 Vertex
    graph[2].add(new Edge(2,1,1)); 
    graph[2].add(new Edge(2,3,1));
    graph[2].add(new Edge(2,4,4));

    // 3 vertex

    graph[3].add(new Edge(3,1,3)); 
    graph[3].add(new Edge(3,2,1));
    // graph[2].add(new Edge22,4,4));

    // 4 vertex
    graph[4].add(new Edge(4,2,2)); 
    
    // 2 neightbours

    for(int i=0; i<graph[2].size();i++)
    {
        Edge e= graph[2].get(i);    
        System.out.println(e.dest);           //src, dest,wt
    }
}
} 
