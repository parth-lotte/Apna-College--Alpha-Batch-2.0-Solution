public class selectionSort {

    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("The Final Sorted Array ="+ arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,6,5,99,12,40};
        selectionSort(arr);
        printArray(arr);

    }
    
}
