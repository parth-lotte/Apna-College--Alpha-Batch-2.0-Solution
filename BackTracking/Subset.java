public class Subset {

    public static void Fs(String str, String ans, int i){

        // base case 
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("null");
            }
            else
            {
            System.out.println(ans);
            }
            
            return ;
        }


        Fs(str, ans+str.charAt(i), i+1);    /// yes choice
        Fs(str, ans, i+1);                 // no choice 

    }
    public static void main(String args[])
    {
        String str="abc";
        Fs(str, "", 0);

    }
}