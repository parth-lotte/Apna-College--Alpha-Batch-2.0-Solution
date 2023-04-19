import java.util.*;
public class LargestSA {

    public static void main(String args[])
    {
        int arr[]={15,-2,2,-8,1,7,10,23};

        // We will use hashmap for the same 

        HashMap<Integer,Integer> map= new HashMap<>();

        int sum=0;
        int len=0;

        for(int j=0; j<arr.length; j++)
        {
            sum+=arr[j];

            if(map.containsKey(sum))

            {
                len=Math.max(len, j-map.get(sum));
            }
            else 
            {
                map.put(sum,j);
            }
        }
        System.out.println("The length of the subarray = "+ len);
    }
    
}
