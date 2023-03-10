public class buildBST{

    static class Node {
        int data;
        Node left;
        Node right;
    Node(int data)
    {
        this.data=data;

    }
};
    public static Node BST(Node root, int val)
    {
        if(root==null)
        {
            root= new Node(val);
            return root;
        }

        if(root.data>val)
        {   // LEFT SUBTREE
            root.left= BST(root.left,val);
        }
        else 
        {  //RIGHT SUBTREE
            root.right= BST(root.right,val);
        }
        return root;
    }

    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+ " ");
        inOrder(root.right);
    }



    public static void main(String args[])
    {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0; i<values.length;i++)
        {
            root= BST(root, values[i]);
        }

        inOrder(root);
        System.out.println();
    }
}