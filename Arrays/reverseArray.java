import java.util.*;
public class reverseArray {

    public static void reverse_Array(int number[])
    {
        int i=0;
        int j=number.length-1;

        while(i<j)
        {
            int t= number[i];
            number[i]=number[j];
            number[j]=t;
            i++;
            j--;
        }

    }
    public static void main(String args[])
    {
        int number []={1,2,3,4,5,6,7,8,9,10};
        reverse_Array(number);

        for(int i=0; i<number.length; i++)
        {
            System.out.print(" " +number[i]);
        }
        System.out.println();

    }
    
}
