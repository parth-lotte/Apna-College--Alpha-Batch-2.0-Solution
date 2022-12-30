import java.util.*;
public class pallindromeStrings {
    public static boolean pallindromeString(String str)
    {
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);

        str= sc.nextLine();
        System.out.println(pallindromeString(str));

    }
    
}
