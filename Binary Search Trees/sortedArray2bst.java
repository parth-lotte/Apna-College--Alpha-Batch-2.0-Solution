public class sortedArray2bst {

    static class Node {

        int data;
        Node left;
        Node right;


        public Node(int data)
        {
            this.data= data;
            this.left=null;
            this.right=null;
        }
    }


    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }

        System.out.println(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node bstarray(int arr[], int s, int e)
    {
        if(s>e)
        {
            return  null;
        }

        int mid= (s+e)/2;
        Node root= new Node(arr[mid]);
        root.left=bstarray(arr, s, mid-1);
        root.right=bstarray(arr, mid+1, e);
        return root;
    }


    public static void main(String args[])
    {
        int arr[]={3,5,6,8,10,11,12};

        Node root= bstarray(arr, 0, arr.length-1);
        preOrder(root);
    }
    
}
