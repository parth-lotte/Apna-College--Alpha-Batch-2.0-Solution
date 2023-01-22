public class linkedList{
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

    public void firstAdd(int data)
    {
        Node newNode= new Node(data);// create a new node
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
    public void add(int index, int data)
    {
        Node newNode= new Node(data);
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
    public static void main(String args[])
    {
        linkedList ll= new linkedList();
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
    }
} 