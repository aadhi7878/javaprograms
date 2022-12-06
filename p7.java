import java.util.*;
public class p7 {
    final int max=10;
    int[]a=new int[max];
    int f;
    int r;
    p7(){
        f=-1;
        r=-1;
    }
    public boolean isempty(){
        if(f==-1&&r==-1){
            return true;
        }else{
            return false;
        }
    } 
    public boolean isfull(){
        if(r>=max-1){
            return true;
        }else{
            return false;
        }
    }
    public void enque(int x){
        if(isempty()){
            f+=1;
            r+=1;
            a[r]=x;
        }else{
          r+=1;
          a[r]=x;
        }
    }
    public int dequeue(){
        if(isempty()){
            System.out.println("empty");
        }
        int k=a[f];
        f+=1;
        return k;
    }
    public void display(){
        for(int i=f;i<=r;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        p7 p=new p7();
        for(int i =0;i<5;i++){
            System.out.print("enter the number--");
            int w=sc.nextInt();
           p.enque(w);
        }
        System.out.println();
        p.display();
    }
}
