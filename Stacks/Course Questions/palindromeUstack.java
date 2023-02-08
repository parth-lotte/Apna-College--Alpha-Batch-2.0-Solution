import java.util.*;
public class palindromeUstack {
     class Node {
        int data;
        Node next;

        Node(int d)
        {
            this.data=d;
            this.next=null;
        }
        public  Node head;
        public   Node tail;
    }
   

    public static boolean isPalindrome(Node head)
    {
        Node slow= head;
        boolean ispalin= true;
        Stack<Integer> s= new Stack<Integer>();
        while(slow!=null)
        {
            s.push(slow.data);
            slow=slow.next;
        }
        while(head!=null)
        {
            int i= s.pop();
            if(head.data==i)
            {
                ispalin= true;
            }
            else
            {
                ispalin=false;
                break;
            }
            head=head.next;
        }
        return ispalin;    
   
    }

        public static void main(String args[])
    {
        palindromeUstack li= new palindromeUstack();
        // Node one = new Node(1);
        // Node two = new Node(2);
        // Node three = new Node(3);
        // Node four = new Node(4);
        // Node five = new Node(3);
        //  Node six = new Node(2); 
        //  Node seven = new Node(1);

       
             one = new Node(1);
             two = new Node(2);
             three = new Node(3);
               = new Node(4);
             five = new Node(3);
             six = new Node(2); 
             seven = new Node(1);


        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;

        boolean cond= isPalindrome(one);
        System.out.println("Palindrome "+ cond);

    }
}