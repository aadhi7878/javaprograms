
import java.util.*;
public class Tree {
   
    
    public static class Node{
        int data;
        Node ls;
        Node rs;
        // public  Node(int data){
        //     this.data = data;
        // }
    }
    public static Node insert(Node root){
        
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a value for root node");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        if(root==null){
            root=new Node();
            root.data=data;
            

        }
        root=new Node();
        root.data=data;
        System.out.println("enter the number for left sub tree"+data+"-->");
        root.ls=insert(root);
        System.out.println("enter the element for right sub tree"+data+"-->");
        root.rs=insert(root);


      return root;
    } 
    public static void  preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.ls);
        preorder( root.rs);
    }
    public static void inorder(Node root){
        if(root==null)return ;
        inorder(root.ls);
        System.out.print(root.data+" ");
        inorder(root.rs);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.ls);
        postorder(root.rs);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        Node root=null;
       // Tree obj=new Tree();
        
        Node key;
        
        key=insert(root);
        
        preorder(key);
        System.out.println();
        inorder(key);
        System.out.println();
        postorder(key);
        System.out.println();
       //sc.close();
        
    }
   
}
