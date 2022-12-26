import java.util.*;
public class questionArray {

    public static boolean duplicateNumber(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        int nums []={1,2,5,5,66,96,88,2,2,6}; //Array with duplicacy
        int nums1 []={1,2,3,4,56,7}; //Array without duplicacy

        System.out.println("The answer is: "+duplicateNumber(nums));
        // System.out.println("\n");
        System.out.println("The answer without duplicacy is: "+duplicateNumber(nums1));

    }

    
}
