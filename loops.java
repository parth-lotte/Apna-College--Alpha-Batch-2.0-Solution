import java.util.*;
public class Loops {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do
        {
            System.out.println("Enter the number :");
            number =sc.nextInt();

            if(number%2==0)
            {
                evenSum+=number;
            }
            else 
            {
                oddSum+=number;
            }

            System.out.println("If you wish to continue? Press 1 for yes or Press 0 for no");

            choice=sc.nextInt();
            System.out.println("Sum of even number"+ evenSum);
            System.out.println("Sum of even number"+ oddSum);

        }while(choice==1);

        
    }
    
}
