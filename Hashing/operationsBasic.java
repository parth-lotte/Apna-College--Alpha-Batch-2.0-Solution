import java.util.*;

public class operationsBasic {
    public static void  main(String args[])
    {
        // create HashMap 

        HashMap<String,Integer> hm= new HashMap<>();

        // Insert 
        hm.put("India",100);
        hm.put("China", 150);
        hm.put("USA",200);
        hm.put("UK", 350);

        // printing the list 

        System.out.println(hm);

        // Get- O(1)

        int pop= hm.get("India");
        System.out.println(pop);

        System.out.println(hm.get("Indonesia")); // will give null values

        //ContainsKey

        System.out.println(hm.containsKey("India"));


        System.out.println(hm);
        System.out.println(hm.remove("India"));
        System.out.println(hm);
    }
}