import java.util.Queue;
import java.util.LinkedList;

public class preorderTree {

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

    static class BinaryTree {
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);

                return newNode;

        }

        // Preorder Traversal

        public static void preorder(Node root)
        {
            if(root==null)
            {
                return ;
            }
            System.out.println(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Inorder Traversal
        public static void Inorder(Node root)
        {
            if(root==null)
            {
                return ;
            }
            Inorder(root.left);
            System.out.println(root.data+ " ");
            Inorder(root.right);
        }
        public static void Postorder(Node root)
        {
            if(root==null)
            {
                return ;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.println(root.data+ " ");
            
        }

            // Level order Binary Tree  

            // public static void levelOrder(Node root)
            // {
            //     if(root==null)
            //     {
            //         return;
            //     }

            //     Queue<Node> q= new LinkedList<>();
            //     q.add(root);
            //     q.add(null);

            //     while(!q.isEmpty())
            //     {
            //         Node currNode= q.remove();
            //         if(currNode==null)
            //         {
            //             System.out.println();
            //             if(q.isEmpty())
            //             {
            //                 break;
            //             }
            //             else{
            //                 q.add(null);
            //             }
            //             else {
            //                 System.out.println(currNode.data+ " ");
            //                 if(currNode.left!=null)
            //                 {
            //                     q.add(currNode.left);
            //                 }
            //                 if(currNode.right!=null)
            //                 {
            //                     q.add(currNode.right);
            //                 }
            //             }
            //         }
            //     } 

            // }

        

                                             

        
    }  // binary class tree end 
    public static void main(String args[])
    {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println();

        tree.preorder(root);
        System.out.println();
        tree.Inorder(root);
        System.out.println();
        tree.Postorder(root);
        // tree.levelOrder(root);

    }
}