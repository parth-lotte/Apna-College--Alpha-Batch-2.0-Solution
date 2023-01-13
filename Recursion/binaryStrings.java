public class binaryStrings {

    public static void  stringsBinary(int n, int lastvalue, String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }

        stringsBinary(n-1, 0, str+"0");
        if(lastvalue==0)
        {
            stringsBinary(n-1, 1, str+"1");
        }
    }
    public static void main (String [] args)
    {
        stringsBinary(3, 0, "");
    }
    
}
