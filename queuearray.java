import java.util.*;
public class queuearray {
    final int max=2;
    int fr;
    int r;
    int qu[]=new int[max];
        queuearray(){
            fr=-1;
            r=-1;
     }
      void enque(int ele){
        if(fr==-1&&r==-1){
            fr=0;
            r=0;
            qu[r]=ele;
        }
        else{
            if(r==qu.length-1){
                System.out.println("queue overflow");
            }
            else{
                r++;
                qu[r]=ele;
            }
        }
    }
    int dequeue(){
        if(qu.length==0){System.out.print("Queue is Empty");}
        int x = qu[fr];fr+=1;
        return x;
    }
    void display(){
        System.out.print("the queue contains :");
        for(int i=fr;i<=r;i++){
            
            System.out.print(qu[i]+" ");
        }
    System.out.println();
    }
    public static void main(String[] args) {
        queuearray q=new queuearray();
      Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.print("enter the rear number");
            int elem=sc.nextInt();
        q.enque(elem);}
        q.display();
        q.dequeue();
        q.display();
        sc.close();
    }
    
    
}
