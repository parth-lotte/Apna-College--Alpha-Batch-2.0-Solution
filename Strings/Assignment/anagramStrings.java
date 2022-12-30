import java.util.*;
public class anagramStrings {

    public static void checkAnagram(String s1, String s2){
        // boolean result;

        String str1=s1.toLowerCase();
        String str2=s2.toLowerCase();

        if(str1.length()==str2.length())
        {
            char [] str1ca=str1.toCharArray();
            char [] str2ca=str2.toCharArray();

            Arrays.sort(str1ca);
            Arrays.sort(str2ca);

             boolean result= Arrays.equals(str1ca,str2ca);
            if(result){
                System.out.println(str1+ " and "+ str2+ "Are anangram of each other" );
            }
            else{
                System.out.println(str1+ " and "+ str2+ "Are not anangram of each other" );

            }
        }
        else
        {
            System.out.println(str1+ " and "+ str2+ "Are not anangram of each other" );
        }

        // return result;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two strings S1 and S2 :\n");

        String S1=sc.nextLine();
        String S2=sc.nextLine();
        checkAnagram(S1, S2);

    }
    
}
