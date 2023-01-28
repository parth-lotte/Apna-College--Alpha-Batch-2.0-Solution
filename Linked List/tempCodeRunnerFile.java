public Node findMid(Node head)
    {
        Mode slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null)  // checks for Mid
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;   // slow is my mid node
    }
    public boolean checkPalindrome()
    {
        if(head==null || head.next!=null)
        {
            return true;
        }
   /// step 1 = find mid node
        Node midNode=findMid(head);
        //Step 2= reverse 2nd half
            Node prev= null;
            Node curr= midNode;
            Node next;
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            // Step 3=Check left half & right half
            Node right=prev;
            Node left= head;
            while(right!=null)
            {
                if(left.data!=right.data)
                {
                return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;
    }