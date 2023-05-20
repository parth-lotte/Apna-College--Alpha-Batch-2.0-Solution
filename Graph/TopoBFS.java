import java.util.*;
public class TopoBFS {
    
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
        // graph[6].add(new Edge(6,5,1));

    }


    // Topological Sort same as DFS just add stack.add(curr)
    // later pop the elements 
public static void Caldeg(ArrayList<Edge> [] graph, int indeg[])
{
    for (int i = 0; i < graph.length; i++) {
        int v=i;
        for (int j = 0; j < graph[v].size(); j++) {
            Edge e= graph[v].get(j);

            indeg[e.dest]++;
        }
        
    }
}
    public static void topSort(ArrayList<Edge> graph[])
    {
        int indeg[]= new int[graph.length];
        Caldeg(graph,indeg);

        Queue<Integer> q= new LinkedList<>();
        for (int i = 0; i < indeg.length; i++) {
            if(indeg[i]==0)                         // we will add those 
                                                    // elements which have in degree 0 in the queue

            {
                q.add(i);
            }            
        }


        // BFS

        while(!q.isEmpty())
        {
            int curr= q.remove();
            System.out.println(curr+ " ");
            for (int j = 0; j < graph[curr].size(); j++) {
                Edge e= graph[curr].get(j);

                indeg[e.dest]--;            // we will decrease the in degree from the array
                if(indeg[e.dest]==0)
                {
                    q.add(e.dest);
                }    

            }
        }
    }
 public static void main(String args[])
 {
    int V=6;

    ArrayList<Edge> graph[]=new ArrayList[V];
    createGraph(graph);
    // bfs(graph);
    // dfs(graph,0,new boolean[V]);
    topSort(graph);
 }
    
}
