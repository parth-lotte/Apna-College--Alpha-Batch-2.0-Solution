import java.util.ArrayList;

public class introArraylist{
    public static void main(String args[])
    {
        ArrayList<Integer> arr= new ArrayList<>();
        ArrayList<String> arr2= new ArrayList<>();
        ArrayList<Boolean> arr3= new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        // System.out.println(arr);

        //Get Element

        // int Element= arr.get(5);
        // System.out.println(Element);

        int Element1= arr.remove(4);
        System.out.println(Element1+" "+ arr);
    
        arr.set(2,10);
        System.out.println(arr);
        
        System.out.println(arr.contains(4));

    }
}