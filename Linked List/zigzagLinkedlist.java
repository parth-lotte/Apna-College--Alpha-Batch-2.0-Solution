public class zigzagLinkedlist {

    // We will solve this question using 3 Steps 
    //  S1. Find the mid
    // S2. Reverse the linked list 2nd half.
    // s3. Alternate Merging 
    
    public Node findMid(Node head)
    {
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;

    }

    public void zigZag(){
        // mid 
        Node mid= findMid();

        // reverse the second half

        Node curr= mid.next; // head for 2 nd half
        mid.next=null; // first half ended and divided

        // for reversing we need three variables curr prev and next

        Node prev=null;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node LeftH=head; //left head for the Linked List 1;
        Node RightH=prev; // Right head for the Linked List 2;

        Node nextL, nextR; // next element of node left and node right
        
        while(LeftH!=null && RightH!=null)
        {
            nextL= LeftH.next;
            LeftH.next=RightH;
            nextR=RightH.next;
            RightH.next=LeftH;
            
            LeftH= nextL;
            RightH=nextR;

        }
    }
}
