public class ques2 {
    static String digits[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
public static void convString( int number)
{
    

    if(number==0)
    {
        return;
    }
     int lastDigit=number%10;
     convString(number/10);
     System.out.println(digits[lastDigit]+" ");
}
    public static void main(String [] args)
    {
        convString(2002);
    }
    
}
