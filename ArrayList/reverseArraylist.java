import java.util.ArrayList;

public class reverseArraylist {
    public static void main(String args[])
    {
        ArrayList <Integer> arr= new ArrayList<>();
         arr.add(1);
         arr.add(2);
         arr.add(3);
         arr.add(4);
         arr.add(5);

         for (int i = arr.size()-1; i>=0; i--) {
            System.out.println(arr.get(i));
         }

    }
    
}
