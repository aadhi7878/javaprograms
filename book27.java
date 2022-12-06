import java.util.*;
class book27{
   
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
    public static void npreorder(Node root){
        Stack<Node>node=new Stack<>();
        node.push(root);
        Node cur=null;
        while(!node.isEmpty()){
            cur=node.pop();
            System.out.print(cur.data+" ");
            if(cur.right!=null){
                node.push(cur.right);
            }
            if(cur.left!=null){
                node.push(cur.left);
            }
        }
        
    }
    public static void ninorder(Node root){
        Stack<Node>node=new Stack<>();
        Node cur=root;
        while(!node.isEmpty()||cur!=null){
            if(cur!=null){
                node.push(cur);
                cur=cur.left;
            }else{
                Node nod=null;
                nod=node.pop();
                System.out.print(nod.data+" ");
                cur=nod.right;
            }
        }
    }
    public static boolean isLeaf(Node cur){
        return cur.left==null?cur.right==null:false;
    }
    public static void npostorder(Node root){
        Stack<Node>stack1=new Stack<>();
        Stack<Node>stack2=new Stack<>();
        Node cur=root;
        stack1.push(cur);
        while(!stack1.isEmpty()){
            cur=stack1.pop();
            stack2.push(cur);
            if(cur.left!=null){
                stack1.push(cur.left);
            }
            if(cur.right!=null){
                stack1.push(cur.right);
            }
        }
        while(!stack2.isEmpty()){
            root=stack2.pop();
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
    Node root=null;
    root=buildtree(root);
    preorder(root);
    System.out.println();
    npreorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    npostorder(root);
    System.out.println();
    inorder(root);
    System.out.println();
    ninorder(root);
    
    }
}