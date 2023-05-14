import java.util.*;
public class CycleGraph {
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
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));


        // vertex 1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));

        // vertex 2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,1));

        // vertex 3
        graph[3].add(new Edge(3,0,1));
        graph[3].add(new Edge(3,4,1));
        
        graph[4].add(new Edge(4,3,1));



    }

        // We will use the concept of connceted compontents

        public static boolean detectCycle(ArrayList<Edge> []  graph)
        {
            boolean vis[]= new boolean[graph.length]; // we create an array with false 
                                                      // to store the visit status of nodes 
                

            for(int i=0 ; i<graph.length ; i++)
            {
                if(!vis[i]){
                    // curr will be i and par -1 as koi hai nhi abhi
                    if(detectCycleUtil(graph, vis, i, -1))   
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public static  boolean detectCycleUtil(ArrayList<Edge> []  graph, boolean vis[], int curr, int par)
        {
            vis[curr]= true;

            for(int i=0; i<graph[curr].size();i++)
            {
                Edge e= graph[curr].get(i);

                // case 3 
                if(!vis[e.dest])
                {
                    if(detectCycleUtil(graph,vis,e.dest, curr))
                    {
                        return true;
                    }
                }

                //case 1
                else if (vis[e.dest] && e.dest!=par)
                {
                    return true;
                
                }
                // case 2 continue hai hi loop
            }
            return false;
              
        }

    public static void main(String args[])
    {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}

