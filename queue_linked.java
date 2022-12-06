import java.util.Scanner;

public class queue_linked {
     Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }}
        void enqueue(int data){
             Node new_node=new Node(data);
            if(head==null){
                new_node.data=data;
                head=new_node;
            }else{
                Node cur=head;
               while(cur.next!=null){
                cur=cur.next;
               } 
               cur.next=new_node;

            }
        }
        void dequeue(){
            if(head==null){
                System.out.println("queue is empty");
            }head=head.next;
        }
        void display(){
            if(head==null){
                System.out.println("queue is empty");
            }
                 Node cur=head;
            while(cur.next!=null){
                System.out.print(cur.data+" ");
             cur=cur.next;
             }System.out.print(cur.data);
              System.out.println();

        }
        public static void main(String[] args) {
            queue_linked q=new queue_linked();
            Scanner sc=new Scanner(System.in);
           /**  for(int i=0;i<5;i++){
                int x=sc.nextInt();
                q.enqueue(x);
            }
            q.display();
            q.dequeue();
            q.enqueue(12);
            q.display();  */
            System.out.println("press one to enqueue the data");
            System.out.println("press two to dequeue the data");
            System.out.println("press 3 to display the queue");
            System.out.println("press 4 to exit");
            int x=sc.nextInt();
            while(x!=0){
            switch(x){
                case 1:{
               q.enqueue(sc.nextInt());
                   break ;
                }
                case 2:{
                    q.dequeue();
                    break;
                }
                case 3:{
                    q.display();
                    break;
                }
                case 4:{
                    x=0;
                }
            }
        }
            sc.close();
        }
    
    
}
