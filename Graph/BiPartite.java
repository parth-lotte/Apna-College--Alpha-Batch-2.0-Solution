import java.util.*;
public class BiPartite {
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

        public static boolean isBiPartite(ArrayList<Edge> [] graph)
        {
            int col[]= new int [graph.length];
            for (int i = 0; i < col.length; i++) {
                col[i]=-1;      // no color intialise with -1
            }

            Queue<Integer> q= new LinkedList<>();
            for (int i = 0; i < graph.length; i++) {
                if(col[i]==-1) { // BFS
                    q.add(i);

                    col[i]=0; //yellow 
                    while(!q.isEmpty())
                    {
                        int curr= q.remove();  
                        for (int j = 0; j < graph[curr].size(); j++) {  // traverse the arraylist
                                                                          
                            Edge e= graph[curr].get(j);   // e.dest

                            if(col[e.dest]==-1)       // color nhi hai toh will give
                            {
                                int nextCol=col[curr]==0?1:0; 
                                col[e.dest]=nextCol;
                                q.add(e.dest); 
                            }

                            else if(col[e.dest]==col[curr])
                            {
                                return false;     // Not Bi-partite 
                            }
                            
                        }
                    }
                }
            }
            return true;
        }

    public static void main(String args[])
    {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(isBiPartite(graph));
        
    }
}


