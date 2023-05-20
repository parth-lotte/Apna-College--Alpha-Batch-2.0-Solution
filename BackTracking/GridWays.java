public class GridWays {

    public static int Gridways(int i, int j, int n, int m)
    {
        // base case if the source is at the targetr only 
        if(i==n-1 && j==m-1){
            return 1; 
        }
        else if(i==n || j==m)
        {
            return 0;
        }

        int w1= Gridways(i+1, j, n, m);
        int w2= Gridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String args[])
    {
        // int i=0, j=0;
        int n=3, m=3;
        System.out.println(Gridways(0,0,n,m));
    }
    
}

