import java.util.*;
public class bubbleSort
{

    public static void bubble_Sort(int arr[])
    {
        for(int turn=0; turn<arr.length-1;turn++)
        {
            for(int j=0; j<arr.length-1-turn; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // return -1;
    }

public static void printArray(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+ " ");
    }
    System.out.println();
}
public static void main(String args[])
{
    int arr[]={15,6,9,88,55,655,12};
    bubble_Sort(arr);
    printArray(arr);

}

}