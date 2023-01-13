public class ques3 {
    public static int lengthString(String str)
    {
        if(str.length()==0)
        {
            return 0;
        }

      return  lengthString(str.substring(1))+1;
    }
    public static void main(String [] args)

    {
        String str = "Parth Lotte";
        // lengthString(str);
        System.out.println(lengthString(str));
    }
    
}
