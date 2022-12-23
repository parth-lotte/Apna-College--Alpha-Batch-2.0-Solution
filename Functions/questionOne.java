import java.util.*;
public class questionOne {

    public static double averageNumber(double x,double y,double z)
    {
        return (x+y+z)/3;   
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number. ");
        double x= sc.nextDouble();
        System.out.println("Enter the second number. ");
        double y= sc.nextDouble();
        System.out.println("Enter the third number. ");
        double z= sc.nextDouble();

        System.out.println("The Average of three numbers: "+averageNumber(x,y,z)) ;

    }
    
}
