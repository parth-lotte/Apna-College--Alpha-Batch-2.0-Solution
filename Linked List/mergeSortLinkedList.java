import org.w3c.dom.Node;

public class mergeSortLinkedList {

    public Node getMid(Node head)
    {
        Node slow= head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next; // +1
            fast=fast.next.next; // +2
        }
        return slow;    // mid value
    }

    public Node merge(Node head1, Node head2)
    {
        Node mergedLL= new Node(-1);
        Node temp= mergedLL;

        while(head1!=null && head2!=null)
        {
            if(head1.data<=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;

            }
            else 
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;

            }
        }
        while(head1!=null)
        {
        
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;


        }

        while(head2!=null)
        {
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;

        }

        return mergedLL.next;  // next cause we have stored dummy node as the head and we dont want that
    }

    public Node mergeSort(Node head)
    {
        if(head=null && head.next==null)
        {
            return head;
        }
    
    // We will solve this into 3 steps 

   // S1- find the mid of the linked list 
        Node mid= getMid();

   // S2. Left & Right MS
        Node rightHead= mid.next;
        mid.next= null;    // list divided into left and right 
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);
        
        //merge 

        return merge(newLeft,newRight);
    }
    public static void main(String args[])

    
}
