 import java.util.*;
public class oddOreven 
{

    public static void oddEven(int n)
    {
        int bitMask=1;
        if((n&bitMask)==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main (String args[])
    {
        int n=3;
        // System.out.println();
        oddEven(n);
    }

}