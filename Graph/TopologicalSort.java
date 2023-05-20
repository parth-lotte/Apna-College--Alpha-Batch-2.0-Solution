import java.util.*;
public class TopologicalSort {
    
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
        // graph[0].add(new Edge(0,2,1));


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
        graph[6].add(new Edge(6,5,1));

    }


    // Topological Sort same as DFS just add stack.add(curr)
    // later pop the elements 

    public static void topSort(ArrayList<Edge> [] graph)
    {
        boolean vis[]= new boolean[graph.length];
        Stack<Integer> s= new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            {
                if(!vis[i])
                {
                    topSortutil(graph, i,vis,s);
                }
            }
            
        }
        while(!s.isEmpty())
        {
            System.out.println(s.pop()+ " ");
        }
    }


    public static void topSortutil(ArrayList<Edge> [] graph, int curr, boolean[] vis,Stack<Integer> s  )
    {
        vis[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e= graph[curr].get(i);
            if(!vis[e.dest])
            {
                topSortutil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
 public static void main(String args[])
 {
    int V=7;

    ArrayList<Edge> graph[]=new ArrayList[V];
    createGraph(graph);
    // bfs(graph);
    // dfs(graph,0,new boolean[V]);
    topSort(graph);
 }
    
}
