import java.util.*;
public class linearSearch {

    public static int linearSearch(int numbers[], int key)
    {
        for(int i=0;i<numbers.length;i++)
        {   
            if(numbers[i]==key){
                // System.out.println("Number found at pos:" + i );
              return i;  
            }

            
        }  
        return -1;
    }

    public static void main(String args[])
    {
        int numbers []={1,2,3,4,6,7,8,9,10,12};
        int key=10;
        int index= linearSearch(numbers, key);

        if(index==-1)
        {
            System.out.println("Not Found!");
        }
        else
        {
            System.out.println("Found at index: "+ index);
        }
    }
    
}
