import java.util.*;

public class twopointerPairSum {

    public static boolean pairSum(ArrayList<Integer> arr, int target)
    {
        int lp=0;
        int ep= arr.size()-1;

        while(lp!=ep)
        {
            if(arr.get(lp)+arr.get(ep)==target)
            {
                return true;
            }
            else if(arr.get(lp)+arr.get(ep)<target)
            {
                lp++;
            }else {
                ep--;
            }
        
            
        
        }
        return false;
    }

    public static void main(String args[])
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);

        int target= 5;
        // pairSum(arr, target)
        System.out.println(pairSum(arr, target));
    }
    

    
}
