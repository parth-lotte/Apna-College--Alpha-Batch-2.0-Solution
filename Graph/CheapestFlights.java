public class CheapestFlights {

    // We will make a class Edge to make the graph 

    static class Edge {
        int src; 
        int des; 
        int wt; 

        public Edge(int src, int des, int wt)
        {
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
    }

    public static void createGraph(int flights[][],ArrayList<Edge> graph[])
    {
        for(int i=0; i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();

        }

        // We will store the details of flights in src dest and wt and create 
        // a new edge

        for(int i=0; i<flights.length; i++)
        {
            int src= flights[i][0];
            int dest= flights[i][1];
            int wt= flights[i][2];

            Edge e= new Edge(src,dest,wt);
            graph[src].add(e);

        }

    }

    // Now we will make the function to calculate the cheapflighs 

    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v,int c,int s)
        {
            this.v=v;
            this.cost=c;
            this.stops=s;
        }
    }

    public static int cheapFly(int n, int flights[][], int src, int dest, int k)
    {
        ArrayList<Edge> graph[]=new ArrayList[n];
        createGraph(flights, graph);

        int dist[]= new int [n];
        for(int i=0; i<n; i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;   // infinity store krdenge baaki edges mein 
            }
        }

        Queue<Info> q= new LinkedList<>();
        q.add(new Info(src,0,0));

        while(!q.isEmpty())
        {
            Info curr=q.remove();

            if(curr.stops>k)
            {
                break;
            }

        }

        for(int i=0; i<graph[curr.v].size();i++)
        {
            Edge e= graph[curr.v].get(i);  // edge nikalenge 
            int u= e.src;
            int v=e.dest;
            int wt=e.wt;

            if(curr.cost+wt<dist[v] && curr.stops<=k)
            {
                dist[v]=curr.cost+wt;
                q.add(new Info(v,dist[v],cuur.stops+1))

            }
        }

        if(dist[dest]==Integer.MAX_VALUE)
        {
            return -1;
        }
        else {
            return dist[dest];
        }

    }
    public static void main(String[] args) {
        int n=4;
        int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0, dst=3,k=1;
        cheapFly(n, flights, src, dst, k)


        
    }
    
}
