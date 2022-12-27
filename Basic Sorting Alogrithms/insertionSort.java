public class insertionSort {

    public static void insertion_sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            // finding out the correct position
            while(prev>=0 && arr[prev]>curr)
            {
                 arr[prev+1]=arr[prev];
                 prev--;
            }
            // Inertion 

            arr[prev+1]=curr;
        }
    }

    public static void print_array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

    public static void main(String args[])
    {
        int arr[]={12,5,6,8,9,7,8,56,89};
        insertion_sort(arr);
        print_array(arr);
    }
    
}
