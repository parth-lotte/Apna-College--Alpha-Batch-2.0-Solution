import java.util.ArrayList;
public class bruteforcePairsum {
public static boolean pairSum(ArrayList<Integer> arr, int target)
    {
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1; j<arr.size();j++)
            {
                if(arr.get(i)+arr.get(j)== target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
     ArrayList<Integer> arr= new ArrayList<>();
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
     int target=5;
    System.out.println(pairSum(arr, target));
    } 
}
