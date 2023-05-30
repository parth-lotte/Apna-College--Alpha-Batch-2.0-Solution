import java.util.*;
public class Dijkstra {
    
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
// We will create a pair class
    static class Pair implements Comparable<Pair>
    {
        int n;
        int path;

        public Pair(int n, int path)
        {
            this.n=n;
            this.path=path;
        }

        @Override
        public int CompareTo(Pair p2)
        {
            return this.path-p2.path; // path based sorting for my pairs 
        }
    }


    public static void Dijkstra(ArrayList<Edge> graph[], int src)
    {
        int dist[]= new int [graph.length]; // for storing the distance ->src

        for (int i = 0; i < graph.length; i++) {
            if(i!=src)   // source i ke equal hoga toh distance 0 hi rhega
            {
                dist[i]= Integer.MAX_VALUE;      //+Infinity 
            }
        }

        boolean vis[]= new boolean[graph.length];
    
    PriorityQueue<Pair> pq= new PriorityQueue<>();
    pq.add(new Pair(src, 0));

    // loop

    while(!pq.isEmpty())
    {
        Pair curr= pq.remove();
        if(!vis[curr.n])
        {
            vis[curr.n]=true;
            // neighbours 

            for (int i = 0; i < graph[curr.n].size(); i++) {
                Edge e= graph[curr.n].get(i);

                int u= e.src;
                int v= e.dest;
                int wt= e.wt;

                // Algo Condition

                if(dist[u]+wt <dist[v])    //  update the distance 
                {
                    dist[v]= dist[u]+wt;
                    pq.add(new Pair(v,dist[v]));
                }
                
            }
        }
    }
    for (int i = 0; i < dist.length; i++) {
        System.out.print(dist[i]+ " ");
    }
    System.out.println();
}


   
 public static void main(String args[])
 {
    int V=6;

    ArrayList<Edge> graph[]=new ArrayList[V];
    createGraph(graph);
    // bfs(graph);
    // dfs(graph,0,new boolean[V]);
    // topSort(graph);
    // int src= 5, dest=1;
    // printAllPath(graph, src, dest, "");
    int src=0;
    Dijkstra(graph, src);
 }
    
}
