import java.util.*;
public class diameterTree {

    static class Node{
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
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
     }

     public static int diameter(Node root)
     {
        if(root==null)
        {
            return 0;
        }
        int ld= diameter(root.left);
        int rd= diameter(root.right);
        int lh= height(root.left);
        int rh=height(root.right);
        int sd= lh+rh+1;

        return Math.max(sd, Math.max(ld, rd));
     }

    // checking for isIdentical or not 
    public static boolean isIdentical(Node node, Node subRoot)
    {
        if(node==null && subRoot==null)
        {
            return true;
        }
        else if(node==null || subRoot==null || node.data!=subRoot.data)
        {
            return false;
        }
        if(!isIdentical(node.left, subRoot.left))
        {
            return false;
        }
        if(!isIdentical(node.right, subRoot.right))
        {
            return false;
        }

        return true;
         
    }
     //subtree In A tree

     public static boolean isSubtree(Node root, Node subRoot )
     {
        if(root==null)
        {
            return false;
        }
        if(root.data==subRoot.data)
        {
            if(isIdentical(root,subRoot))
            {
                return true;
            }
        }
            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot); 
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

        System.out.println(diameter(root));

        // subtreee

        Node subRoot= new Node(2);
        subRoot.left= new Node(4);
        subRoot.right= new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
    
}
