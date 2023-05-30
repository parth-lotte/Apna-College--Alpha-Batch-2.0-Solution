import java.util.*;
public class PathtoTarget {
    
    static class Edge {
        int src;
        int dest;
        int wt;
    

    public  Edge(int s, int d, int w)
    {
        this.src=s;
        this.dest=d;
        this.wt=w;

    }
    }
    static void createGraph(ArrayList<Edge> [] graph)
    {

        // loop for each vertex and then from that i'th index we will make a 
        // new array list 
        for(int i=0; i<graph.length;i++)
        {
            graph[i]= new ArrayList<>();
        }

        // vertex 0
        // graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,3,1));


        // // vertex 1
        // graph[1].add(new Edge(1,0,1));
        // graph[1].add(new Edge(1,3,1));

        // vertex 2
        graph[2].add(new Edge(2,3,1));
        // graph[2].add(new Edge(2,0,1));

        // vertex 3
        graph[3].add(new Edge(3,1,1));

        // vertex 4
        graph[4].add(new Edge(4,0,1));
        graph[4].add(new Edge(4,1,1));
 
        
        // vertex 5
        graph[5].add(new Edge(5,0,1));
        graph[5].add(new Edge(5,2,1));
        // graph[5].add(new Edge(5,6,1));

        // vertex 6
        // graph[6].add(new Edge(6,5,1));

    }

public static void printAllPath(ArrayList<Edge> [] graph, int src, int dest, String path)
{
    if(src==dest)
    {
        System.out.println(path+dest);
        return;
    }

    for (int i = 0; i < graph[src].size(); i++) {

        Edge e= graph[src].get(i);

        printAllPath(graph, e.dest, dest, path+src);
        
    }
}
   
 public static void main(String args[])
 {
    int V=6;

    ArrayList<Edge> graph[]=new ArrayList[V];
    createGraph(graph);
    // bfs(graph);
    // dfs(graph,0,new boolean[V]);
    // topSort(graph);
    int src= 5, dest=1;
    printAllPath(graph, src, dest, "");
 }
    
}
