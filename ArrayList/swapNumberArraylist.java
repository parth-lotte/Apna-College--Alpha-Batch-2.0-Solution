import java.util.ArrayList;

public class swapNumberArraylist {

    public static void Swap(ArrayList<Integer>arr, int ind1,int ind2)
    {
        int t=arr.get(ind1);
        arr.set(ind1,arr.get(ind2));
        arr.set(ind2, t);
    }
    public static void main(String args[])
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(01);
        arr.add(11);
        arr.add(71);
        arr.add(100);
        arr.add(144);
        arr.add(112);
        int ind1=0, ind2=2;

        Swap(arr,ind1,ind2);
        System.out.println(arr);
    }
    
}
