import java.util.*;

public class doublylinkedlist {
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
    void add(int data){
         if(head==null){
            Node node=new Node(data);
            head=node;
            tail=node; 
            size++;
        }else{
            Node node=new Node(data);
            tail.next=node;
            node.pre=tail;
            tail=node;
            size++;
        }
    }
    void insertAtFront(int data){
        if(head==null){
            Node node=new Node(data);
            head=node;
            tail=node; size++;
        }else{Node node=new Node(data);
            head.pre=node;
            node.next=head;
            head=node;size++;
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
 void inAfEle(int ele,int data ){
    if(head==null){
        System.out.println("linked list is empty");
        }
        Node node=new Node(data);  
    Node cur=head;
    while(cur!=null&&cur.data!=ele){
        cur=cur.next;
    }if(cur==null){
        System.out.println("poindhi");
        return;
    }

else{
    cur.next.pre=node;
    node.next=cur.next;
    node.pre=cur;
    cur.next=node;
    size++;
}
    
}
void inBefele(int ele,int data){
      if(head==null){
        System.out.println("linked list is empty");
      }Node cur=head;
      while(cur.next.data!=ele&&cur!=null){
       cur=cur.next;
      }if(cur==null){
        System.out.println("element not found");
      }
      else{Node node=new Node(data);
        node.next=cur.next;
        cur.next.pre=node;
        cur.next=node;
        node.pre=cur;size++;
      }

}
void inAtpos(int pos,int data){
    if(pos>1&&pos<=size){ Node cur=head;
      for(int i=1;i<pos-1;i++){
         cur=cur.next;
      }        Node node=new Node(data);
      node.next=cur.next;
      cur.next.pre=node;
      cur.next=node;
      node.pre=cur;size++;
}else if(pos==1){
    insertAtFront(data);
}
else{
    System.out.println("position unavailable");
}
}
void delFirst(){
    if(head==null){
        System.out.println("linked list is empty");
    }else{
        head=head.next;
        head.pre=null;
        size--;
    }
}
void delLast(){
    if(head==null){
        System.out.println("linked list is empty");
    }
    else if(head==tail){
        head=null;
        size--;
    }else{
        tail=tail.pre;
        tail.next=null;
        size--;
    }
}
void delele(int ele){
      if(head==null){
        System.out.println("linked list is empty");
      }Node cur=head;
      while(cur.data!=ele&&cur!=null){
        cur=cur.next;
      }System.out.println(cur.data);
      if(cur.next==null){
        delLast();
      }else if(head.data==cur.data){
      delFirst();
      }else{
        cur.next=cur.next.next;
        cur.next.pre=cur;
        size--;
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
    void rdisplay(){
        if(head==null){
            System.out.println("no elements are in double linked list");
        }else{ Node cur=tail;
            while(cur.pre!=null){
                System.out.print(cur.data+" ");
                cur=cur.pre;
            }System.out.print(cur.data);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        doublylinkedlist d=new doublylinkedlist();
        Scanner sc=new Scanner(System.in);
      for(int i =0;i<3;i++){
           int x=sc.nextInt();
         d.add(x);
       }
     d.display();
      d.delele(3);
       d.display();
       // d.rdisplay();
        
        
              sc.close();
    }
}
