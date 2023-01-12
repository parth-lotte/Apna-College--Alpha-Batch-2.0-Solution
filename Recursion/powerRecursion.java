import java.util.*;
public class powerRecursion {

    public static int pow(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }

        return x*pow(x,n-1);
    }

    public static void main(String [] args)
    {
        int x;
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x & n \n");
        x=sc.nextInt();
        n=sc.nextInt();
        System.out.println(pow(x, n));
    }
    
}
