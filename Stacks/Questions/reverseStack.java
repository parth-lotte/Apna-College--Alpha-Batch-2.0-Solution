import java.util.*;

public class reverseStack {

    // For this we will create three methods
    // pushatbottom()
    //reverse stack() 
    // printStack()

    public static void pushAtbottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtbottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            return ;
        }
        int top= s.pop();
        reverseStack(s);
        pushAtbottom(s,top);
    }
    
    public static void printStack(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.pop());

        }
    }

    public static void main(String args[])
    {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // 3,2,1
        // printStack(s);

        System.out.println();
        reverseStack(s);
        printStack(s);

    }
    
    
}
