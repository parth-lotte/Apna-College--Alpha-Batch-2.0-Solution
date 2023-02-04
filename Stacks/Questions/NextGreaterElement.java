import java.util.*;
public class NextGreaterElement {

    public static void main(String args[])
    {
        int arr[]= {6,8,0,1,3};
        Stack<Integer> s= new Stack<>();
        int nxtGreat[]= new int [arr.length];

        for(int i=arr.length-1; i>=0; i--)
        {
            //1. While
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }

            // 2. if else

            if(s.isEmpty())
            {
                nxtGreat[i]=-1;
            }
            else {
                nxtGreat[i]= arr[s.peek()];

            }

            // push in stack 
            s.push(i);
        }
        for (int i = 0; i < nxtGreat.length; i++) {
            System.out.println(nxtGreat[i]+ " ");
            
        }

    }

    
}
