public class searchLinkedlist{
    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void firstAdd(int data)                                   // making a new node
    {
        Node newNode= new Node(data);
        size++;// create a new node
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;// pointing next to head
        head=newNode;// making newNode as head
    }

    public void lastAdd(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        size++;
        tail.next=newNode;
        tail=newNode;
    }
    public void printLink()
    {
        if(head==null)
            {
                System.out.println("Empty String");
                return;
            }
        Node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void add(int index, int data)  // adding in between the linked list 
    {
        if(index==0)
        {
            firstAdd(data);
            return;
        }
                Node newNode= new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1)
        {
            System.out.println(temp.data);
            temp=temp.next;
            i++;
        }
        // i=index-1, temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("Linked List underflow");
            return Integer.MAX_VALUE;
        }
        else if(size==1)
        {
            int val= head.data;
            head=tail=null;
            return val;
        } 
        int val= head.data;
        head= head.next;
        size--;
        return val;
    }
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("String is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev= head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null; // we reach the second last
        tail=prev;
        size--;
        return val;
    }

          /*KEY SEARCH using linear search */
    public int itrSearch(int key)
    {
        Node temp= head;
        int i=0;

        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
    return -1;   // key not found
    }

    /* KEY SEARCH USING RECURSIVE METHOD */
public int helper(Node head, int key)
{
    if(head==null)
    {
        return -1;

    }
    if(head.data==key)
    {
        return 0;

    }
    int idx= helper(head.next, key);
    if(idx==-1)
    {
        return -1;
    }
    return idx+1;
}
    public int recSearch(int key)
    {
        return helper(head,key);
    }
      public void reverseLinkedlist()
      {
        if(head==null)
        {
            System.out.println("Empty strings");
            
        }
        Node prev= null;
        Node curr=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;            // reversing linked list here
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
      }
    public static void main(String args[])
    {
        searchLinkedlist ll= new searchLinkedlist();
        // ll.printLink();
        ll.firstAdd(2);
        // ll.printLink();
        ll.firstAdd(1);
        // ll.printLink();  
        ll.lastAdd(3);
        // ll.printLink();
        ll.lastAdd(4);
        ll.add(2, 40);
        ll.printLink();
        //System.out.println(ll.size);
        System.out.println();
        ll.removeFirst();
        ll.printLink();
        ll.removeLast();
        ll.printLink();

        System.out.println("Key found at "+  ll.itrSearch(3));
        System.out.println();
        System.out.println("Key found at "+  ll.recSearch(3));
        System.out.println();

        ll.reverseLinkedlist();
        ll.printLink();
    }
} 