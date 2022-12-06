
class postorder{
    public void fun(Node root) {
        
    }
    class BST {
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
        }       


public class stack_linked {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
         this.data=data;
         this.next=null;
        }}
      public void push (int ele){
        Node st=new Node(ele);
        if(head==null){
           head=st;
           st.next=null;
        }
        else{
            st.next=head;
            head=st;
        }
       }
       void pop(){
        if(head==null){
            System.out.println("stack is empty");
     }
        else{
               head=head.next;
        }
     }
    }
}