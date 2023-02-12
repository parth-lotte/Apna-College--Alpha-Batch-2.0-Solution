import java.util.Queue;
import java.util.LinkedList;
public class firstNonrepeating {

    public static void nonRepeating(String str)
    {
     int freq[]= new int[26]; // 'a' - 'z'
Queue<Character> q= new LinkedList<>();

        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            q.add(ch);
            
            freq[ch-'a']++; // checking for the frequency 

            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            {           
                q.remove();
            }
            if(q.isEmpty())
            {
                System.out.println(-1+ " ");
            }
            else
            {
                System.out.println(q.peek()+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        String str="aabccxb";
        nonRepeating(str);
        
    }
    
}
