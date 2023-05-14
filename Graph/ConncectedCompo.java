/* IN CONNECTED COMPONENT WE CREATE HELPER function 
        which helps in traversing those node which are not visited 

        the helper function is usually denoted by the Util name eg. dfs util
*/ 




import java.util.*;
public class ConncectedCompo {

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

    public static void bfs(ArrayList<Edge> [] graph)
    {
        boolean vis[]= new boolean [graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!vis[i])
            {
                bfsutil(graph,vis);
            }
        }
    }

    public static void bfsutil(ArrayList<Edge> [] graph, boolean [] vis)
    {
        // BFS implemented using queue

        Queue<Integer> q= new LinkedList<>();
        // We will create an array for storing visiting values 

        

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

    public static void main(String args[])
 {
    int V=7;

    ArrayList<Edge> graph[]=new ArrayList[V];
    createGraph(graph);
    bfs(graph);
    // dfs(graph,0,new boolean[V]);
 }
    
}









