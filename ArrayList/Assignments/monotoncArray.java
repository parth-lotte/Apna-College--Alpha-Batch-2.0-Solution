import java.util.*;
public class monotoncArray{
    public static boolean monoArray(ArrayList<Integer> A)
    {
        boolean inc= true;
        boolean dec= true;
        for(int i=0; i<A.size()-1; i++)
        {
            if(A.get(i)<A.get(i+1))
            {
                dec=false;

            }else if(A.get(i)>A.get(i+1)){
                inc=false;
                
            }
        }
        return inc || dec;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> A= new ArrayList<>();
        A.add(1);
        A.add(11);
        A.add(21);
        A.add(31);
        A.add(42);
        // monoArray(A);
        System.out.println(monoArray(A));


    }
}