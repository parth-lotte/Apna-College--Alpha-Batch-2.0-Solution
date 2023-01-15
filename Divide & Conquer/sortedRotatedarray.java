public class sortedRotatedarray {

    public static int search(int arr[],int si,int tar,int ei){
        // Base case

        if(si>ei)
        {
            return -1;
        }
         // Calculating mid

         int mid= si+ (ei-si)/2;
        if(arr[mid]==tar)
        {
            return mid;
        }

        //Mid on L1

        if(arr[si]<=arr[mid])
        {
            if(arr[si]<=tar && tar<=arr[mid]) //Case a
            {
                return search(arr, si, tar, mid-1);
            }
            else{  // case b
                return search(arr, mid+1, tar, ei);
            }
        }
        // mid on L2
        else {
            if(arr[mid]<=tar && tar<=arr[ei])
            {
                return search(arr, mid+1, tar, ei);
            } // case c
            else {
                return search(arr, si, tar, mid-1);
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        int trgIndx=search(arr, 0, 0, arr.length-1);
        System.out.println(trgIndx);
    }
    
}
