import java.util.*;
public class pairArrays 
{

    public static void array_pairs(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
           int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++)
            {
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int numbers []={2,4,6,8,10};
        // for(int i=0;i<numbers.length;i++)
        // {
        //     System.out.println(numbers[i]);
        // }
            array_pairs(numbers);
    }

    
}
