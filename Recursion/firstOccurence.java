public class firstOccurence {

    public static int firstOcc(int arr[],int i, int key)
    {

        if(i==arr.length-1)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }

        return firstOcc(arr, i+1, key);
    }

    public static void main(String [] args)
    {
        int arr[]={1,5,9,8,6,2,3,5};
        int key=8;
        System.out.println(firstOcc(arr, 0, key));
        
    }
    
}
