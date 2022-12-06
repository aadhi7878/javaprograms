

public class circular_linkedlist {
    Node h;
    Node t;
   public class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=h;
    }
   }
   void insertAtlast(int data){
       if(h==null){
         Node node=new Node(data);
          h=node;
          t=node;
          t.next=h;
       }else{Node node=new Node(data);
        t.next=node;
        t=node;
    t.next=h; }
   }
   void inAtfirst(int data){
    if(h==null){
        Node node=new Node(data);
         h=node;
         t=node;
         t.next=h;
      }else{
        Node node=new Node(data);
        node.next=h;
        h=node;
        t.next=h;
      }
   }
   void inAfele(int ele,int data){
    if(h==null){
        System.out.println("linked list is empty");
    }else{
        Node cur=h;
        while(cur.data!=ele){
            cur=cur.next;
        } if(cur.next==h){
            insertAtlast(data);
        }else{
            Node node=new Node(data);
            node.next=cur.next;
            cur.next=node;
        }
    }
   }
   void inbefele(int ele,int data){
        if(h==null){
            System.out.println("we cannot insert element before the element");
        }
        else if(h.data==ele){
            inAtfirst(data);
        }
        else{
            Node cur=h;
            while(cur.next.data!=ele){
                cur=cur.next;
            }
            System.out.println(cur.data);
           // inAfele(cur.data, data);
           Node node=new Node(data);
           node.next=cur.next;
           cur.next=node;
        }
   }

   void display(){
    if(h==null){
        System.out.println("circular list is empty");
    }else{Node cur=h;
        while(cur.next!=h){
            System.out.print(cur.data+" ");
            cur=cur.next;
        } System.out.print(cur.data);
        System.out.println();  
   }
   }


    public static void main(String[] args) {
        circular_linkedlist c=new circular_linkedlist();
        c.insertAtlast(1);
        c.insertAtlast(2);
     c.inAtfirst(12);
   //  c.inAfele(2, 56);
     //c.inAfele(12, 34);
     c.inbefele(1,14);

        c.display();
        
    }
}
