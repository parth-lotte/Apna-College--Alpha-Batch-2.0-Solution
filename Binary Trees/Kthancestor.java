import java.util.ArrayList;

// import javax.lang.model.util.ElementScanner14;
import java.util.*;

public class Kthancestor {

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

//     public static boolean getPath(Node root, int n, ArrayList<Node> path)
//     {
//         if(root==null)
//         {
//             return false;
//         }
//         path.add(root);
        
//         if(root.data==n)
//         {
//             return true;
//         }

//         boolean foundLeft= getPath(root.left, n, path);
//         boolean foundRight= getPath(root.right, n, path);

//         if(foundLeft || foundRight)
//         {
//             return true;
//         }

//         path.remove(path.size()-1);

//         return false;
       
//     }

//     public static Node lca(Node root, int n1,int n2)
//     {
//         ArrayList<Node> path1= new ArrayList<>();
//         ArrayList<Node> path2= new ArrayList<>();

//         getPath(root,n1,path1);
//         getPath(root,n2,path2);
        
//         //Lowest Common Ancestor

//         int i=0;
//         for(; i<path1.size() && i<path2.size(); i++)
//         {
//             if(path1.get(i)!=path2.get(i))
//             {
//                 break;
//             }
//         }
//         Node lca= path1.get(i-1);
//         return lca;
//     }

// // minimum distance btw two nodes

// // Node distance
//     public static int lcaDist(Node root, int n)
//     {
//         if(root==null)
//         {
//             return -1;
//         }
//         if(root.data==n)
//         {
//             return 0;
//         }

//         int lDist= lcaDist(root.left, n);
//         int rDist= lcaDist(root.right, n);
//         if(lDist==-1 && rDist==-1 )
//         {
//             return -1;
//         }
//         else if(lDist==-1)
//         {
//             return rDist+1;
//         }
//         else {
//             return lDist+1;
//         }
//     }

//     // min distance

//     public static int minDist(Node root, int n1, int n2)
//     {
//         // Node lca1= lca(root, n1, n2);
//         int d1= lcaDist(root, n1);
//         int d2= lcaDist(root, n2);
        
//         return d1+d2;
//     }

public static int KAncestor(Node root, int n, int k)
{
    if(root==null)
    {
        return -1;
    }

    if(root.data==n)
    {
        return 0;
    }
    int lD=KAncestor(root.left, n, k);
    int rD=KAncestor(root.right, n, k);

    if(lD==-1 && rD==-1)
    {
        return -1;
    }

    int max= Math.max(lD,rD);

    if(max+1==k){
        System.out.println(root.data);
    }
    return max+1;
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
        int n=5 , k=1;
        System.out.println(KAncestor(root, n, k));

        // System.out.println(lca(root, n1, n2).data);
        // System.out.println(minDist(root, n1, n2));
        
    }

    
}
