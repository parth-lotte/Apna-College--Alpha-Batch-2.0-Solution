import java.util.*;
public class LhashSet{

    public static void main(String args[])
    {
        HashSet<String> hs= new HashSet<>();

        hs.add("Delhi");
        hs.add("Bombay");
        hs.add("Chennai");


        // Using iterator 

        // Iterator it = hs.iterator();
        // while(it.hasNext())
        // {
        // System.out.println(it.next());
        // }


        // using advanced for loop 

        for(String it: hs)
        {
            System.out.println(it);
        }
        LinkedHashSet<String> lhs= new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Bombay");
        lhs.add("Chennai");
        System.out.println(lhs);

        TreeSet<String> ts= new TreeSet<>();
        ts.add("Delhi");
        ts.add("USA");
        ts.add("China");
        System.out.println(ts);
    }
    
}

    

