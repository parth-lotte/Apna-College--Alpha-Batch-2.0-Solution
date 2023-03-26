import java.util.*;

public class insertHeap{

    static class Heap{
        ArrayList<Integer> arr= new ArrayList<>();

        public void add(int data)     // O(logn)
        {
            // add at last indx

            arr.add(data);
            int x= arr.size()-1;      // last child index
            int par= (x-1)/2; // par index

            while(arr.get(x)<arr.get(par))
            {
                // swap

                int temp= arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }

        }

        public int peek()                           // peek in array 
        { 
            return arr.get(0);
        }
    }
    public static void main(Strings args[])
    {

    }
}