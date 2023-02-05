class Solution {
    public boolean isValid(String s) {

        Stack <Character> S= new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch= s.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{' )  // opening
            {
                S.push(ch);
            }
            else 
            {
                if(s.isEmpty())
                {
                    return false;
                }

                if(S.peek()=='(' && ch==')' || S.peek()=='[' && ch==']' || S.peek()=='{' && ch=='}')
                {
                    S.pop();  // closing 
                }
                else
                {
                    return false;
                }
            }
        }

        if(S.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}