import java.util.*;
public class bt {
    public static class Node{
        int data;
        Node right;
        Node left; 
    }
    static Scanner sc=new Scanner(System.in);
    public static Node insert(Node root){
        System.out.print("enter the number");
        int ele=sc.nextInt();
        if(ele!=-1){
            Node node=new Node();
            node.data=ele;
        
               root=node;
               
            
                root.left=insert(root);
                root.right=insert(root);
            }
        else{
            root=null;
        }return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root) {
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
        
    }
    public static void main(String[] args) {
        Node root=null;
        root=insert(root);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }

    

}
