import java.util.*;
public class dll {
    Node head;
    Node tail;
    int size=0;
    public class Node{
        int data;
        Node pre;
        Node next;
        
        Node(int data){
        this.data=data;
        this.next=null;
        this.pre=null;
        }
    }
    void inatlast(int data){
        if(head==null){
            Node node=new Node(data);
            head=node;
            tail=node; size++;
        }else{Node node=new Node(data);
            node.pre=tail;
            tail.next=node;
            tail=node;size++;
      }
 }
 void delete(int val){
    if(head==null){
      System.out.println("list is empty");
      return;
    }
    if(head.data==val){
        if(head==tail){
            head=null;
            tail=null;
        }else{
            head=head.next;
        }
        return;
    }
    Node tem=head;
    while(tem!=tail&&tem.next.data!=val){
        tem=tem.next;
    }
    if(tem==null){
        System.out.println("element is not found");
    }else{
        if(tem.next==tail){
            tem.next=null;
            tail=tem;
        }else{
            tem.next=tem.next.next;
        }
    }
}
void display(){
    if(head==null){
        System.out.println("no elements are in double linked list");
    }else{ Node cur=head;
        while(cur.next!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }System.out.print(cur.data);
        System.out.println();
    }
}
public static void main(String[] args) {
    dll d=new dll();
    Scanner sc=new Scanner(System.in);
    for(int i =0;i<5;i++){
       //  int x=sc.nextInt();
       d.inatlast(i+1);
     }
     System.out.println("enter the number to delete");
     d.delete(sc.nextInt());
     d.display();
     sc.close();

}
}
