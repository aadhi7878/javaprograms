import java.util.*;
public class stacksarray {
    final int max=10;
    int top;
    int stack[]=new int[max];
    stacksarray(){
        top=-1;
    }
    void push(int ele){
        if(top>max-1){
            System.out.println("stack overflow");
        }
        else{
            top++;
            stack[top]=ele;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("under flow");
        }
        int k=stack[top];
        top--;
        return k;
    }
    void peek(){
        if(top==-1){
            System.out.println("empty stack");
        }
        System.out.println(stack[top]);
    }
    void display(){
        if(top==-1){
            System.out.println("empty");
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }
    public static void main(String[] args) {
        stacksarray obj=new stacksarray();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<7;i++){
        System.out.println("hello enter");
        int t =sc.nextInt();
        obj.push(t);
            
        }
        obj.pop();
        obj.display();
        sc.close();
    }
    
}
