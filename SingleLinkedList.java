import java.util.*;

public class SingleLinkedList {
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
    public void inatfirst(int data){
        Node newnode= new Node(data);
        if(h==null){
            h=newnode;
            t=newnode;    
        }
        else{
            newnode.next=h;
            h=newnode;
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
    public void afElement(int ele,int data){
        if(h==null){
            System.out.println("list is empty");
        }
        else{
            Node newnode=new Node(data);
            Node tem=h;
            while((tem.data!=ele)&&(tem!=null)){
                tem=tem.next;
            }
            newnode.next=tem.next;
            tem.next=newnode;
        }     
    }
    public void befElement(int ele,int data){
        if(h==null){
            System.out.println("list is empty");
        }
        else{
            Node newnode=new Node(data);
            Node tem=h;
            Node tem1=tem.next;
            while((tem1.data!=ele)&&(tem1!=null)){
                tem=tem1;
                tem1=tem1.next;
            }   
            newnode.next=tem1;
            tem.next=newnode;
        }
    }
    public void inafpos(int pos,int data){
        if(h==null){
            System.out.println("list is empty");
        }
        else{
            Node tem=h;
            for(int i=1;i<pos;i++){
                  tem=tem.next;
            }
            Node newnode=new Node(data);
            newnode.next=tem.next;
            tem.next=newnode;
        }
    }
    public void inbefpos(int pos,int data){
        if(h==null){
            System.out.println("list is empty");
        }
        else{
            if (pos>1){
            Node tem=h;
            for(int i=1;i<pos-2;i++){
                  tem=tem.next;
            }
            Node newnode=new Node(data);
            newnode.next=tem.next;
            tem.next=newnode;}
            else{
                System.out.println("we cannot insert this method please try InsertFirst method");
            }
        }
    }
    public void delAtfirst() {
        if(h==null){
            System.out.println("list is empty");  
        }
        else{
            Node temp=h;
            temp=temp.next;    
            h=temp;
        }    
    }
    public void delAtlast(){
        if(h==null){
            System.out.println("list is empty");  
        }//here temp is previous pointer and temp1 is a next pointer of the previous pointer
        else{
            Node temp=h;
            Node temp1=temp.next;
            while(temp1.next!=null){
                temp=temp1;
                temp1=temp1.next;
            }
            temp.next=null;
            t=null;
        }    

    }
    
    public void search(int key){
        Node tem=h;
        while(tem!=null) {
            if(tem.data==key){
                System.out.println("element found");
                return;
            }
            tem=tem.next;
           
        }
        System.out.println("element not found");
        
    }
    public void display(){
        Node cur =h;
        if(h==null){
            System.out.println("list is empty");

        }
        while(cur!=null){
            System.out.print(cur.data +" ");

            cur=cur.next;
        }
         System.out.println();
    }
public static void main(String[] args) {
    SingleLinkedList sll = new SingleLinkedList();
      
    
    Scanner obj=new Scanner(System.in);

    System.out.println("enter number of elements do you want");
    int n=obj.nextInt();
    for(int i=0;i<n;i++){
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the number");
        int b=obj.nextInt();
        sll.add(b);

    }
   // sll.befElement(3, 44);
    //sll.afElement(3, 34);
    //sll.inafpos(3, 11);
    //sll.inbefpos(1, 81);
    sll.delAtlast();
    
    
    sll.display();
}

}    
