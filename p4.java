import java.util.*;
public class p4 {
    final int max=10;
    int[]a=new int[max];
    int top;
    
    p4(){
        top=-1;
    }
    public boolean isfull(){
        if(top>=max-1){
            return true;
        }else{
            return false;
        }

    }
    public boolean isempty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int x){
       if(isfull()){
        System.out.println("we can't enter the number");
       }else{
        top++;
        a[top]=x;
       }
    }
    public int pop(){
        if(isempty()){
            System.out.println("we can't pop the elements");
        }
        int k=a[top];
        top-=1;
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        p4 p=new p4();
        for(int i=0;i<6;i++){
            System.out.print("enter the number--");
               int x=sc.nextInt();
            p.push(x);
        }
        System.out.println();
        for(int i=0;i<6;i++){
            System.out.print(p.pop()+" ");
        }
    //    System.out.println(p.pop());
    //  p.push(2);
    //  p.push(8);
    //  p.push(12);
    //  p.push(2);
    //  p.push(1);
    //  System.out.print(p.pop());
    //  System.out.print(p.pop());
    //  System.out.println(p.pop());
    //  System.out.println(p.pop());
    //  System.out.println(p.pop());
    }
}
