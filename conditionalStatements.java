import java.util.*;
public class conditionalStatements {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        int x = sc.nextInt();

        if (x>0)
        {
            System.out.println("Number is greater than 0 and is positive");

        }
        else
        {
            System.out.println("Number is less than 0 and is negative");
        }
    }
    
}
