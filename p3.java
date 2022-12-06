import java.util.*;
public class p3 {
    
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        } 
    }
    Node h = null;
    Node t= null;
    public void add(int data){
        Node newnode= new Node(data);
        if(h==null){
            h=newnode;
            t=newnode;
        }
        else{
            t.next=newnode;
            t=newnode;
        }
    }
    public void inatlast(int data) {
        Node newnode= new Node(data);
        if(h==null){
            h=newnode;
            t=newnode;    
        }
        else{
            Node tem =h;
            while(tem.next!=null){
                tem=tem.next;
            }
            tem.next=newnode;
            t=newnode;
        }    
    }
    public void delete(int val){
        if(h==null){
            System.out.println("empty");
        }
        else if(h.data==val){
            h=h.next;
        }
        else{
            Node tem=h;
            Node pre =h;
            while(tem.next!=null&&tem.data!=val){
                pre=tem;
                tem=tem.next;
            }
            if(pre.next==null){
                System.out.println("element not found");
            }
            
             else{if(tem.next==null){
                pre.next=null;
                t=pre;
             }else{
                pre.next=tem.next;
             }

             }
        }
    }
    public void display(){
        Node cur =h;
        if(h==null){
            System.out.println("list is empty");

        }
        while(cur.next!=null){
            System.out.print(cur.data +" ");

            cur=cur.next;
        }
        System.out.print(cur.data);
         System.out.println();
    }
    public static void main(String[] args) {
        p3 p=new p3();
    Scanner obj=new Scanner(System.in);
    System.out.print("enter number of elements do you want");
    int n=obj.nextInt();
    for(int i=0;i<n;i++){
        
        System.out.print("enter the number");
        p.inatlast(obj.nextInt());
    }
    p.display();
    System.out.print("enter the number to delete");
    p.delete(obj.nextInt());
    p.display();
    obj.close();
}
}