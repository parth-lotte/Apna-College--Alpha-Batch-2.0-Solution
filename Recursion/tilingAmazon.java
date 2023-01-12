import java.util.function.ToLongBiFunction;

public class tilingAmazon {

    public static int tilingprob(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return tilingprob(n-1)+tilingprob(n-2);    
    }
    

    public static void main (String[] args)
    {
        int n=2;
        System.out.println(tilingprob(n));
    }
    
}
