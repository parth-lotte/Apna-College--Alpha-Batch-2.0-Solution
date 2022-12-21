import java.util.*;
public class largestNumber{
    public static int getLargest(int number[])
    {
       int largest=Integer.MIN_VALUE;

       for(int i=0;i<number.length;i++)
       {
        if(largest<number[i])
        {
            largest=number[i];
        }
       }
       return largest;
    }


    public static void main(String args[])
    {
        int number[]= {14,25,66,58,98,7,5,4,3,6};
        int largestNumber= getLargest(number);
        System.out.println("Largest Number is: "+ largestNumber);
    }
}