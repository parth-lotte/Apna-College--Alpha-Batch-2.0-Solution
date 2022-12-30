import java.util.*;
public class stringLength {
    
    // Strings are immutable
    public static void main(String args[])
    {
        char arr[]={'a','b','c','d','e'};
        String str="abcd";
        String str2= new String ("ABCD");

        Scanner sc= new Scanner(System.in);

        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(arr);

        String fullName= "Parth Lotte";

        System.out.println("The length of the string is: "+ fullName.length());
    
    }


    
}
