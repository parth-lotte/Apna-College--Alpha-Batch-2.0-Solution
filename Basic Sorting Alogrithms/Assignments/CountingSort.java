package Assignments;

public class CountingSort {

    public static void coutSort(int arr[])
    {
        //  first we will find the range maximum range 

        for(int i=0; i<arr.length; i++)
        {
            int range=Integer.MIN_VALUE;

        range= Math.max(range,arr[i]);
        }

        int count []= new int [range+1];   // zero bhi count hota hai max ranger mein 
        for(int i=0; i<count.length; i++)
        {
            count[arr[i]]++;   // same indx par frequecny icrease 
         }

        // Sorting 

        int j=0;
        for(int i= 0; i<count.length; i++ )
        {
            arr[j]=i;
            j++;
            count[i]--;
        }
    }

    public static void main(String[] args) {
        
    }
    
}
