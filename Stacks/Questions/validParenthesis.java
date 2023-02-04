import java.util.Stack;

public class validParenthesis {

public static boolean isValid(String str)
Stack <Integer> s= new Stack<>();

    for (int i = 0; i < str.length; i++) {
        char ch=str.charAt(i);

        if(ch=='(' || ch=='{' || ch=='[')  // opening
        {
            s.push(ch);
        }
        else {
            if(s.isEmpty())
            {
                return false;
            }

            if(s.peek()=='(' && ch==')' || s.peek()=='[' && ch==']' || s.peek()=='{' && ch=='}'  )
            s.pop();   /// Closing
        }
        else 
        {
            return false;
        }
        
        
    }
    if(s.isEmpty())
        {
            return true;
        }
        else 
        return false;

}

    public static void main(String args[])
    {
        String sts= "({})[]";

    }
    
}
