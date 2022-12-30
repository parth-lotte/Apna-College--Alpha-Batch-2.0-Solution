import java.util.*;

public class lowercaseVowels {

    public static int lowercaseCount(String str)
    {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='u' || ch=='o' || ch=='i' || ch=='e' )
            {
                count++;
            }

            
        }
        return count++;
    }

    public  static  void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        String str;
        System.out.println("Enter the vowels:\n");
        str=sc.nextLine();
        System.out.println(lowercaseCount(str));
    }
}