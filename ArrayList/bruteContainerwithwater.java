import java.util.*;
public class bruteContainerwithwater {

    // Brute Force method (Container with most water)

    public static int containerStore(ArrayList<Integer> arr)
    {
        int maxWater=0;
        for(int i=0;i<arr.size();i++)
        {
         for(int j=i+1;j<arr.size();j++)
         {
            int hi= Math.min(arr.get(i),arr.get(j));
            int width= j-i;
            int capacity= hi*width;
            maxWater= Math.max(capacity,maxWater);
         }
            
        }
        return maxWater;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);

        // containerStore(arr);
        System.out.println(containerStore(arr));
    }
    
}
