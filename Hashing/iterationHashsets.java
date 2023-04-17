import java.util.HashSet;
import java.util.Iterator;

public class iterationHashsets {

    public static void main(String args[])
    {
        HashSet<String> hs= new HashSet<>();

        hs.add("Delhi");
        hs.add("Bombay");
        hs.add("Chennai");


        // Using iterator 

        Iterator it = hs.iterator();
        while(it.hasNext())
        {
        System.out.println(it.next());
        }
    }
    
}
