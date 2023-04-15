import java.util.*;

public class Linkedhash{
    public static void main(String args[])
    {
        TreeMap<String,Integer> lhm= new TreeMap<>();
        lhm.put("India",100);
        lhm.put("China",1020);
        lhm.put("USA",10340);
        lhm.put("PAK", 9990);

        HashMap<String,Integer> hm= new LinkedHashMap<>();
        hm.put("China",1020);
        hm.put("India",100);
        hm.put("USA",10340);

        System.out.println(lhm);
        System.out.println(hm);
    }
}