import java.util.*;

public class heightTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
            
        }
    }

    public static int height(Node root)
    {
        if(root==null)

        {
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);
        return Math.max(lh, rh)+1;

    }


    // count of nodes in a tree

    public static int countNodes(Node root)
    {
        if(root==null)

        {
            return 0;
        }
        int lh= countNodes(root.left);
        int rh= countNodes(root.right);
        return  lh+rh+1;

    }

    // Nodes Sum
    public static int sumNodes(Node root)
    {
        if(root==null)

        {
            return 0;
        }
        int lh= sumNodes(root.left);
        int rh=sumNodes(root.right);
        return  lh+rh+root.data;

    }
    

        public static void main(String args[])
        {

            Node root = new Node(1);
            root.left= new Node(2);
            root.right = new Node(3);
            root.left.left= new Node(4);
            root.left.right = new Node(5);
            root.right.left= new Node (6);
            root.right.right= new Node(7);
            System.out.println(height(root));

            System.out.println();

            System.out.println(countNodes(root));

            System.out.println();
            System.out.println(sumNodes(root));


        }
    

    
}
