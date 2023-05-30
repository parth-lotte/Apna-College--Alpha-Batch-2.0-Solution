import java.util.Arrays;

public class CyclicSort {


    public static void  swap(int arr[],int i, int index)
    {
        int t=arr[i];
        arr[i]=arr[index];
        arr[index]=t;
    }
    public static void sort(int arr[])
    {
        // int index;
        int i=0;

        while(i<arr.length)
        {
            int index= arr[i]-1;

            if(arr[i]!=arr[index])
            {
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {4,6,2,5,6,1,2,46,75,34};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
