public class sumTree {
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

    public static int transform(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftChild= transform(root.left);
        int rightChild= transform(root.right);

        int data= root.data;

        int newLeft= root.left==null ?0:root.left.data;
        int newRight= root.right==null ?0:root.right.data;

        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
    }

    public static void preoder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        System.out.println(root.data+" ");
        preoder(root.left);
        preoder(root.right);
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

        // int n1=4 , n2= 5;
        // int n=5 , k=1;
        // System.out.println(KAncestor(root, n, k));
transform(root);
preoder(root);
        // System.out.println(lca(root, n1, n2).data);
        // System.out.println(minDist(root, n1, n2));
        
    }
    
}
