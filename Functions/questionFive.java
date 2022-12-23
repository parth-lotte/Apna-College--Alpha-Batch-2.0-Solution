import java.util.*;
public class questionFive {

    public static int sum(int n)
    {
        int sumOfdigits=0;
        while(n>0)
        {
        int lastDigit=n%10;
        sumOfdigits= sumOfdigits+lastDigit;
        n/=10;
        }
        return sumOfdigits;
    }

    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        System.out.println("The sum of digits \n"+ sum(x));
        
    }
    
}
