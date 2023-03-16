import java.util.ArrayList;

// import javax.lang.model.util.ElementScanner14;

public class validateBST{

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

// In Range Values

public static void printRange(Node root, int k1, int k2)
{
    if(root==null)
    {
        return;
    }
    if(root.data>=k1 && root.data<=k2)
    {
        printRange(root.left, k1, k2);
        System.out.println(root.data+ "");
        printRange(root.right, k1, k2);
    }
    else if(root.data<k1)
    {
        printRange(root.left, k1, k2);
    }
    else {
        printRange(root.right, k1, k2);
    }
}



// ROOT TO LEAF

public static void printpath(ArrayList<Integer> path)
{
    for (int i = 0; i < path.size(); i++) {
        System.out.println(path.get(i)+ "->");
        
    }
    System.out.println("Null");
}
public static void printleaf(Node root, ArrayList<Integer> path)
{
    if(root==null)
    {
        return;
    }

    path.add(root.data);
    if(root.left==null && root.right==null)
    {
        printpath(path);
    }
printleaf(root.left, path);
printleaf(root.right, path);
path.remove(path.size()-1);
    // printRange(root, 0, 0);

}

    public static boolean isValidBST(Node root, Node min, Node max)
    {
        if(root==null)
        {
            return true;
        }                                                                                              // Valid BSTTTTTTT 

        if(min!=null && root.data<=min.data)
        {
            return false;
        }
        else if(max!=null && root.data>=max.data)
        {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.left, root, max); 
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
        printRange(root, 5, 9);
        System.out.println();
        // inOrder(root);

        printleaf(root,new ArrayList<>() );

        
        if(isValidBST(root,null,null))
        {
            System.out.println("Valid");

        }else {
            System.out.println(" Not Valid");
        }

    }
} 