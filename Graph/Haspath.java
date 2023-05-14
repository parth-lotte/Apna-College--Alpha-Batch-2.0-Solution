import java.util.*;
public class Haspath {
    
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
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));


        // vertex 1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        // vertex 2
        graph[2].add(new Edge(2,4,1));
        graph[2].add(new Edge(2,0,1));

        // vertex 3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        // vertex 4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));
        
        // vertex 5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        // vertex 6
        graph[6].add(new Edge(6,5,1));

    }


    public static void bfs(ArrayList<Edge> [] graph)
    {
        // BFS implemented using queue

        Queue<Integer> q= new LinkedList<>();
        // We will create an array for storing visiting values 

        boolean vis[]= new boolean [graph.length];

        // We will add the first vertex 

        q.add(0);

        while(!q.isEmpty())
        {
            int curr=q.remove();

            if(!vis[curr])
            {
                System.out.println(curr+" ");
                vis[curr]=true;

                // to get the neighbouring edges
                for(int i=0; i<graph[curr].size();i++)
                {
                    Edge e= graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }


public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[])
    {
        // Visit 

        System.out.print(curr+"" );
        vis[curr]=true;

        for(int i=0; i<graph[curr].size();i++)
        {
            Edge e= graph[curr].get(i);

            if(!vis[e.dest])
            {
                dfs(graph, e.dest,vis);
            }
        }

    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[])
    {
        if(src==dest)
        {
            return true;
        }

        for(int i=0; i<graph[src].size(); i++)
        {
            Edge e= graph[src].get(i);
            //  e.dest= neighbor 

            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis))
            {
                return true;
            }
        }
        return false;
    }
 public static void main(String args[])
 {
    int V=7;

    ArrayList<Edge> graph[]=new ArrayList[V];
    // createGraph(graph);
    // // bfs(graph);
    // dfs(graph,0,new boolean[V]);
System.out.println(hasPath(graph, 0, 5, new boolean [V]));
    
 }
    
}
