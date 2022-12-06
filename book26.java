
public class book26 {
    int fr;
    int r;
     final int size=5;
    int cqueue[]=new int[size];
    book26(){
        fr=-1;
         r=-1;
    }
    void enqueue(int data){
        if(fr==-1&&r==-1){
            r=fr=0;
            cqueue[r]=data;
          
        }else if((fr-1)%size==r){
       System.out.println("circular queue is full");
        }else{
          r=(r+1)%size;
          cqueue[r]=data;
        }
    }
    void dequeue(){
        if(fr==-1&&r==-1){
            System.out.println("circular queue is empty");
        }
       else if(fr==r){
            fr=r=-1;
        }else{
            fr=(fr+1)%size;
        }
    }
void display(){
    if(fr==-1&&r==-1){
        System.out.println("circular queue is empty");
    } int cur=fr;
   while(cur!=r){
    System.out.print(cqueue[cur]+" ");
    cur=(cur+1)%size;
   }System.out.print(cqueue[cur]+" ");
   System.out.println();
   System.out.println(fr+"to"+r);
  
}
public static void main(String[] args) {
     book26 c= new book26();
     c.enqueue(1);
   c.enqueue(2);
   c.enqueue(3);
   c.enqueue(4);
   c.enqueue(5);
   c.display();
  c.dequeue();
  c.enqueue(7);
  c.enqueue(8);
   c.display();
   for(int i=0;i<c.size;i++){


   System.out.println(c.cqueue[i]);}
}
}
