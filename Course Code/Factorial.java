public class Factorial {

    public static int Factorial(int a)
    {
        int f=1;

        for(int i=1;i<=a;i++)
        {
            f*=i;
        }
        return f;
    }
    public static void main(String args[])
    {
        int n=4;
        int fact=Factorial(n);
        System.out.println("The factorial of the number is: " + fact );
    }
    
}
