

import java.util.*;
public class deque_linked {
    Node front;
    Node rear;
    public class Node{
        int data;
        Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }}
    void insertAtFront(int data){
        Node node=new Node(data);
        if(front==null){
            
            node.data=data;
             front=node;
             rear=node;
        }else{
            node.next=front;
            front=node;
        }
    }
    void inatlast(int data){
        Node node=new Node(data);
        if(front==null){
            node.data=data;
            front=node;
        }else{Node cur=front;
            while(cur.next!=null){
                cur=cur.next;
            }cur.next=node;
        }
    }
    void delAtfirst(){
        if(front==null){
            System.out.println("we cannot delete the element");
        }else{
            front=front.next;
        }
    }
    void delAtlast(){
        if(front==null){
            System.out.println("we cannot delete the element");
        }
        else{Node cur=front;
            Node aft=front.next;
            while(aft.next!=null){
                cur=cur.next;
                aft=aft.next;
            }cur.next=null;

        }
    }
    void display(){
        if(front==null){
            System.out.println("deque is empty");
        }
        else{Node cur=front;
            while(cur.next!=null){
                System.out.print(cur.data+" ");
                cur=cur.next;
            }System.out.print(cur.data);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        deque_linked d=new deque_linked();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("enter the element");
            int x=sc.nextInt();
            d.inatlast(x);
        }
        d.delAtfirst();
        d.delAtlast();
        d.insertAtFront(12);
        d.insertAtFront(14);
        d.display();
        sc.close();
    }
}
