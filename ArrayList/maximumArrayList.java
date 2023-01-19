import java.util.ArrayList;

public class maximumArrayList {
    public static void main(String args[])
    {
        ArrayList <Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(22);
        arr.add(52);
        arr.add(28);
        arr.add( 132);
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if(max<arr.get(i)){
                max=arr.get(i);
            }
            // else{
            //     return;
            // }
            
        }
        System.out.println("maximum element="+ max);
    }
    
}
