import java.util.LinkedList;

import org.w3c.dom.Node;
public class mergeSortlinkedlist {

    // For this we will solve in this 3 steps
    
    public Node getMid(Node head)
    {
        Node slow=head;
        Node fast= head;

        while(fast!=null || fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;    //mid Node

    }

    public Node merge(Node head1, Node head2)
    {
        Node mergedLL= new Node(-1);
        Node temp=mergedLL;
        while(head!=null && head2!=null)
        {
            if(head1.data<=head2.getUserData){
             temp.next=head1;
                head1=head1.next;
                temp=temp.next;

            }else {
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
return mergedLL.next;

}
public Node mergeSort(Node head)
{
    if(head==null || head.next==null)
    {
        return head;
    }


    // 1. Find the mid
    Node mid= getMid(head);

    // 2. left & right Merge Sort
    // 3. Merge
}
    public static void main(String args[])
    {
        LinkedList ll =new LinkedList<>();

    }

    
}
