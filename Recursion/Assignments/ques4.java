public class ques4 {

    public static int firstLastchar(String str, int i,int j,int n)
    {
        if(n==1)
        {
            return 1;

        }
        else if(n<=0)
        {
            return 0;

        }

        int res= firstLastchar(str, i+1, j, n-1)+
                 firstLastchar(str, i, j-1, n-1)-
                 firstLastchar(str, i+1, j-1, n-2);

        if(str.charAt(i)==str.charAt(j))
        {
            res++;
        }
        return res;
    }
    public static void main(String args[])
    {
        // define string 
         String str="abcab";
        int n= str.length();
        System.out.println(firstLastchar(str,0,n-1,n));

    }
    
}
