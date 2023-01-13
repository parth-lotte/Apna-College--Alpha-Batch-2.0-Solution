public class ques1 {

    public static void countingDuplicate(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return;
        }

        if(arr[i]==key)
        {
            System.out.println(i+" ");
        }

        countingDuplicate( arr, key, i+1);
    }
    public static void main(String [] args)
    {
        int arr[]= {1,2,6,5,8,2,2,6};
        countingDuplicate(arr, 2, 0);
    }
    
}
