import java.util.*;
public class subArray {

    public static void subArray(int number[])
    {
        for (int i=0;i<number.length;i++)
        {
            int start=i;
            for(int j=i; j<number.length;j++)
            {
                int end=j;
                for(int k =0;k<number.length;k++)
                {
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String args[])
    {
        int number []={1,2,4,5,64,12,44};
        subArray(number);

    }
    
}
