import java.util.*;
public class ItenaryTickets {


    public static String getStart(HashMap<String,String> tickets)
    {
        HashMap<String,String> revMap= new HashMap<>();

        for (String key : tickets.keySet()) {

            revMap.put(tickets.get(key),key);
        }
        for (String key : tickets.keySet()) {
            if(!revMap.containsKey(key))
            {
                return key;                         
                // starting key
            }


           
    }
    return null;
}
public static void main(String args[])
{
    // Using hashmap we will solve the questins 

    HashMap<String,String> tickets= new HashMap<>();

    tickets.put("C","B");
    tickets.put("M","D");
    tickets.put("G","C");
    tickets.put("D","G");

    
    String start = getStart(tickets);
    System.out.print(start);
    for (String it : tickets.keySet()) {
        System.out.print("->"+ tickets.get(start));
        start= tickets.get(start);
    }
    System.out.println();
}    
}
