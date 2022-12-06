import java.util.*;
class BinaryTree{
   
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            
        }
    }
    
     static Scanner sc=new Scanner(System.in);
        public static Node buildtree(Node root){
          
            
            System.out.println("enter the root element");
            int ele=sc.nextInt();
            if(ele!= -1){
                 root=new Node(ele);
                // root.data=data;
             root.left=buildtree(root.left);
             root.right=buildtree(root.right);
    
        }
        else{
            root = null;
        }
        return root; 
 }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
    Node root=null;
    root=buildtree(root);
    preorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    inorder(root);
    }
}