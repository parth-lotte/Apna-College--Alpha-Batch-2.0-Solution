import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class binarySearch
{
        public static int Binary_Search(int number[], int key)
    {   
     int start=0; 
     int end=number.length-1;
     

     while(start<=end)
     {
        int mid=(start+end)/2;
        if(number[mid]==key)
        {
            return mid;
        }
        if (number[mid]<key)
        {
            mid=mid+1;
        }
        else {
            mid=mid-1;
        }
    }
    return -1;
    }

    public static void main(String args[])
    {
    int number[]={2,4,6,8,9,10,12,14,16,18,20};
    int key=4;

    int index=Binary_Search(number, key);
    System.out.println("The index is: "+ index);

    }

}