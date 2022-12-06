import java.util.Scanner;

public class dequearray {
    int size=10;
    int fr;
    int r;
    int deque[]=new int[size];
    dequearray(){
        fr=-1;
        r=-1;
    }
    void insertAtFront(int data){
       if(fr==0){
        System.out.println("we cannot insert inthe deque");
       }
       else if(fr==-1){
        fr++;
        r++;
        deque[fr]=data;
       }else{
          fr--;
          deque[fr]=data;
       }
        }
        void delAtFront(){
            if(fr==-1){
                System.out.println("we cannot delete element");
            }
            else if(fr==r){
                fr=-1;
                r=-1; }
                else{
                    fr++;
                }
        }
        void insAtend(int data){
            if(r==size-1){
                System.out.println("overflow");
            }
            else if(fr==-1 && r==-1){
                 fr++;
                 r++;
                 deque[r]=data;
            }else{
                r++;
                deque[r]=data;
            }
        }
        void delAtrear(){
            if(fr==-1&&r==-1){
                System.out.println("we cannot delete element");
            }
            else if(fr==r){
                fr=-1;
                r=-1;
              //  System.out.println("deque is empty");
            }
            else{
                r--;

            }
        }
        void display(){
            if(fr==-1&&r==-1){
            System.out.println("deque is empty");
            }
            else{
            for(int i=fr;i<=r;i++){
                System.out.print(deque[i]+" ");
            }
            System.out.println();}
        }
        public static void main(String[] args) {
            dequearray d= new dequearray();
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<3;i++){
                System.out.print("enter the number"+" ");
            int x=sc.nextInt();
           d.insAtend(x);}
            //d.display();
            //d.delAtFront();
            // d.delAtrear();
           // d.display();
           // d.insertAtFront(1);
           // d.display();
          d.delAtFront();
          d.display();
          d.delAtrear();
          d.display();
          d.delAtrear();
          d.display();
          
            sc.close();
        }

    }
    

