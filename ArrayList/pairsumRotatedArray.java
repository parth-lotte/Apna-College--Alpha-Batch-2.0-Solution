import java.util.ArrayList;

public class pairsumRotatedArray {

    public static boolean pairsunm2(ArrayList<Integer> arr, int target)
    {
        int bp=-1;
        for(int i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i)>arr.get(i+1)) // check for the breakpoint 
            {
                bp=i;
                break;
            }
        }
        int lp=bp+1;// smallest
        int rp=bp;//largest
        int n=arr.size()-1;
        while(lp!=rp)
        {
            if(arr.get(lp)+arr.get(rp)==target)
            {
                return true;
            }
            else if(arr.get(lp)+arr.get(rp)<target)
            {
                lp=(lp+1)%n;
            }
            else
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }


public static void main(String args[])
{
    ArrayList <Integer> arr= new ArrayList<>();
    arr.add(11);
    arr.add(15);
    arr.add(6);
    arr.add(8);
    arr.add(9);
    arr.add(10);

    int target=100;

    System.out.println(pairsunm2(arr, target));
}
    
}
