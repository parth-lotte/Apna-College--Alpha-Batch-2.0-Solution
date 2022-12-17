// package ApnaCollege;

import java.util.Scanner;

public class Costofthree {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        float pencil= sc.nextFloat();
        float pen= sc.nextFloat();
        float eraser= sc.nextFloat();

        float total= pencil+pen+eraser;
        System.out.println("Cost before GST\n" + total);

       // Cost after GST 

       float newTotal= total+ (0.18f*total);
       System.out.println("Cost after adding the GST\n" + newTotal );
    }
    
}
