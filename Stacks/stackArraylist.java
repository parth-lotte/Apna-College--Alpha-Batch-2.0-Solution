import java.util.Stack;
import java.util.*;
public class stackArraylist {
    static class stack {

        static ArrayList<Integer> list = new ArrayList <>();

        public static boolean isEmpty()
        {
            return list.size()==0;
        }
            // Check for the string is empty        


            public static void push(int data)
            {
                list.add(data);
                
            }

            // adding data

            public static int pop() {

                int top= list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;

            }
            // poping data

            public static void peek()
            {
                int top= list.get(list.size()-1);
                //    return top;
            }


        }

        public static void main(String args[])
        {
            Stack s= new Stack();
            s.push(1);
            s.push(2);
            s.push(3);

            while(!s.empty())
            {
                System.out.println(s.peek());
                s.pop();
            }
        }
    
}