import java.util.*;
public class questionTwo {

    public static int  isEven(int number)
    {
        if(number%2==0)
        {
            System.out.println("IS Even number");
            // return 1;
        }
        else
        {
            System.out.println("It's not even");
            // return 0;
        }
        return 0;
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        isEven(x);


    }
    
}
