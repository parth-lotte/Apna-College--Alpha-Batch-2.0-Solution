import java.util.*;
public class quetionThree {

    public static boolean pallindrome(int number)
    {
        int x=number;
        int rev=0;

        while(x!=0)
        {
            int rem= x%10;
            rev=rev*10+rem;
            x=x/10;

        }

        if(x==rev)
        {
            // System.out.println("Number is pallindrome");
            return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :\n");
        int x= sc.nextInt();
        if(pallindrome(x))
        {
            System.out.println("The number is pallindrome");
        }
        else
        {
            System.out.println("not");
        }

    }
    
}
