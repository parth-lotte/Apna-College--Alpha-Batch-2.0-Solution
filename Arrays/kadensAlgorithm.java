import java.util.*;

import javax.print.attribute.standard.NumberUpSupported;
public class kadensAlgorithm {

    public static void kadensAlgorithm(int numbers[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++)
        {
            cs+=numbers[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        
            System.out.println("Our maximum subarray is :" + cs);
    }
    public static void main(String args[])
    {
        int numbers []= {-1,-6,4,7,3,5,8,9,-10};
        kadensAlgorithm(numbers);

    }
    
}
