public class Permutation {


    public static void FS(String str, String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i <str.length(); i++) {
            char curr= str.charAt(i);
             String  Newstr=str.substring(0,i)+str.substring(0,i+1);
            FS(Newstr, ans+curr);


            
        }
    }
    public static void  main(String args[])
    {
        String str= "abc";
        FS(str, " ");

    }
    
}
