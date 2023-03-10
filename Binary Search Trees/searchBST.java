import javax.lang.model.util.ElementScanner14;

public class searchBST{

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

    public static boolean search(Node root, int key)
    {
        if(root==null)
        {
            return false;
        }
        
        if(root.data==key)
        {
            return true;
        }
        else if(root.data>key)
        {
            return search(root.left,key);
        }
        else {
            return search(root.right, key);
        }
    }

        public static Node delete(Node root, int val)
        {
            if(root.data<val)
            {
                root.right=delete(root.right, val);
            }
            else if(root.data>val)
            {
                root.left=delete(root.left, val);
            }
            else {
                if(root.left==null && root.right==null)
                {
                    return null;
                } ///case 1
                if(root.left==null)
                {
                    return root.right;
                } //case 2
                else if(root.right==null)
                {
                    return root.left;
                }

                // case 3
                // both children

                Node IS= findS(root.right);
                root.data=IS.data;
                root.right= delete(root.right, IS.data);
            }
            return root;
        }

        public static Node findS(Node root)
        {

            while(root.left!=null)
            {
                root=root.left;

            }
            return root;
        }


    public static void main(String args[])
    {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0; i<values.length;i++)
        {
            root= BST(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if(search(root, 1))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }

        System.out.println();

        root= delete(root, 1);
        System.out.println();

        inOrder(root);
    }
}