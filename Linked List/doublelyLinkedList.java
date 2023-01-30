import java.util.*;
public class doublelyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node (int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add
    public void addFirst(int data)
    {
        size++;
        Node newNode= new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+ "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // Remove
    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        int val= head.data;
        head=head.next;
        head.prev=null;
        return val;
    }
    public static void main(String args[])
    {
        doublelyLinkedList ll= new doublelyLinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);


        ll.print();
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
    }
}
