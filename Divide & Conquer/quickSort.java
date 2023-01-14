public class quickSort {
    public static void quicksort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pIdx= partition(arr,si,ei);
        quicksort(arr, si, pIdx-1); //left
        quicksort(arr, pIdx+1, ei); //right

    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot= arr[ei];
        int i=si-1;
        for(int j = si; j <ei; j++) {
            if(arr[j]<=pivot)
            {
                i++;
                //Swap
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
                
        }
        i++;
            int t=pivot;
            arr[ei]=arr[i];
            arr[i]=t;
        return i;
    }
    public static void printArr(int arr[])
    {
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args)
    {
        int arr[]={2,6,8,4,9,5,2,3,7,8};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
