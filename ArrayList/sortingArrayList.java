import java.util.ArrayList;
import java.util.*;

public class sortingArrayList {
    public static void main(String args[])
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(19);
        arr.add(18);
        arr.add(17);
        arr.add(16);
        arr.add(15);
        arr.add(14);
        arr.add(13);
        arr.add(12);
        arr.add(11);
        arr.add(10);

        for (int i = 0; i < arr.size(); i++) {
            // System.out.println(arr.get(i));
            // Collections.sort(arr);
            // System.out.println();
            Collections.sort(arr,Collections.reverseOrder());
            System.out.println(arr.get(i));
            
        }
    }
    
}
