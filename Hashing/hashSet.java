import java.util.*;
public class hashSet {
    public static void main(String args[])
    {
        HashSet<Integer> set= new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);

        System.out.println(set);

        if(set.contains(2))
        {
            System.out.println("Contains 2");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println(set);

        set.remove(3);
        System.out.println(set);
    }
}
