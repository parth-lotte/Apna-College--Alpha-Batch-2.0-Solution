public class question2Array {
    public static int minSearch(int nums[],int l,int r,int target)
    {
        int left=l;
        int right=r;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                r=mid-1;
            }
            else {
                l=mid+1;
            }

            
        }
        return -1;

    }
    public static void main(String args[])
    {
        int nums[]={14,15,16,18,20,24};
        System.out.println("The array is : " + minSearch(nums,0,6,18));
        

   }
    
}
