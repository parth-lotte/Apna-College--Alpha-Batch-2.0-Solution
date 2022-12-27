public class questionBubbleSort{
    public static void bubble_Sort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            // System.out.println();
        }
        // return 0;
    }
    public static void main(String args[])
    {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        // System.out.println("The unsorted array:"+ printArray(arr));
        bubble_Sort(arr);
        printArray(arr);


    }
}