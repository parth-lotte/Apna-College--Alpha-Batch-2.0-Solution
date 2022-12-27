public class questionSelectionSort {

    public static void selection_sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]<arr[j])
                {
                    smallest=j;
                }
            }
            int t=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=t;
        }
    }
        public static void printArray(int arr[])
        {
            for(int i=0;i<arr.length-1;i++)
            {

            
            System.out.println(arr[i]);
            }
        }
    public static void main(String args[])
    {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        System.out.println("The unsorted array:");
        selection_sort(arr);
        System.out.println("The sorted array:");
        printArray(arr);

    }
    
}
