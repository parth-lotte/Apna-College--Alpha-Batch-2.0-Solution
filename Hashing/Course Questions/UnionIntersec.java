import java.util.*;

public class UnionIntersec {
    public static void main (String args[])
    {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        HashSet<Integer> set= new HashSet<>();
        // Now will iterate over arr 1 and arr 2
// For the intersection part we have this 

        for (int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++)
        {
            set.add(arr2[j]);
        }

        System.out.println("Union ="+ set.size());


        // we will clear the set before perfoming another operation

        set.clear();

        // For the intersection part we will 
        int count=0;
        for (int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++)
        {
        if(set.contains(arr2[j]))
        {
            count++;
            set.remove(arr2[j]);
        }
    }

        System.out.println("Intersection ="+ count);

    }
    
}
