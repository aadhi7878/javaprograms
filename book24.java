import java.util.*;
public class book24 {
    public static class Node{
        int data;
        Node ls;
        Node rs;
        public Node(int data){
            this.data=data;
            this.ls=null;
            this.rs=null;
        }
        }
        public static Node rinsert(Node root,int ele){
            if(root==null){
                root=new Node(ele);
                return root;
             }
             else if(ele<root.data){
                root.ls=rinsert(root.ls, ele);
             }
             else if(ele>root.data){
                root.rs=rinsert(root.rs, ele);
             }
             else{
                System.out.println("you are entered alredy existed number");
             }
            return root;
        }
        public static void inorder(Node root){
            if(root==null)return;
            inorder(root.ls);
            System.out.print(root.data+" ");
            inorder(root.rs);
        }
    public static Node rsearch(Node root,int ele){
        if(root==null){
            return null;
        }else{
            if(ele==root.data){
                return root;
            }else if(ele<root.data){
                rsearch(root.ls, ele);
            }else if(ele>root.data){
                rsearch(root.rs, ele);
            }
        }
        return null;
       }
       public static Node minele(Node root){
        if(root == null){
            return root;
        }
        else{
            return minele(root.ls);
        }
       }
       public static Node deleteNode(Node root, int value) {
        if (root == null)
            return null;
        if (root.data > value) {
            root.ls = deleteNode(root.ls, value);
        } else if (root.data < value) {
            root.rs = deleteNode(root.rs, value);
 
        } else {
            if (root.ls != null && root.rs != null) {
                Node temp = root;
                Node minrs = minele(temp.rs);
                root.data = minrs.data;
                root.rs = deleteNode(root.rs, minrs.data);
 
            }


            else if (root.ls != null) {
                root = root.ls;
            }
            else if (root.rs != null) {
                root = root.rs;
            }
            else
                root = null;
        }
        return root;
    }
       
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root =null;
        System.out.println("how many elements do you want to insert--");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter the elements--");
            root=rinsert(root,sc.nextInt());
        }
        deleteNode(root, 3);
        deleteNode(root, 1);
        deleteNode(root, 2);
        deleteNode(root, 4);
        deleteNode(root, 5);
        deleteNode(root, 6);
        deleteNode(root, 7);
    
       inorder(root);
       System.out.println();
       sc.close();
    }
    
}
