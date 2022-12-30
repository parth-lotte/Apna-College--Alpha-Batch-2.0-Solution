import java.util.*;
public class getIthbit {

    public static int getithbit (int n,int i)
    {
        // int i;
        int bitMask= 1<<i;
        if((n&bitMask)==0 )
        {
            return 0;
        }
        else{
            return 1;
        }

    }

    public static void main (String args[])
    {
        int n=3;
        int i=2;
        // System.out.println();
        // oddEven(n);
        System.out.println(getithbit(n,i));
    }
    
}
