import java.util.*;
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
       void peek(){
        if(head==null){
            System.out.println("no element in the stock");
        }
        else{
            head=head.next;
        }
       }
       void display(){
        if(head==null){
            System.out.println("empty stack");
        }
        Node cur=head;
        System.out.println("your stack is : ");
        while(cur !=null){
           System.out.print(cur.data +" ");
           cur=cur.next;
        }
        System.out.println();
       }
       public static void main(String[] args) {
        stack_linked s=new stack_linked();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("enter the elements");
             int elem=sc.nextInt();
             s.push(elem);

        }
        s.pop();
         s.display();
         sc.close();
       }
}
