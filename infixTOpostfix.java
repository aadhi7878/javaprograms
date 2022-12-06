import java.util.*;
public class infixTOpostfix {
    public static int  inp_prec(char k){
       if(k=='+'||k=='-'){
        return 1;
       }
       else if(k=='*'||k=='/'){
        return 3;
       }else if(k=='^'){
        return 6;
       }else if(k=='('){
        return 9;
       }else if(k==')'){
        return 0;
       }else{
        return 7;
       }
    } 
    public static int stk_prec(char k){
        if(k=='+'||k=='-'){
            return 2;
           }
           else if(k=='*'||k=='/'){
            return 4;
           }else if(k=='^'){
            return 5;
           }else if(k=='('){
            return 0;
           }else if(k==')'){
            return 0;
           }else{
            return 8;
           }
     
    }
    static class stack{
        int size=0;
        int top=-1;
       char arr[];

        public stack(int x){
            int size=x;
            char arr[]=new char[x];
        }
        public boolean isempty(){
            if(top==-1){
                return true;
            }else{
                return false;
            }
        }
        public void push(char x){
          if(top==size-1){
            System.out.println("stack is full");
          }else{
            top++;
            arr[top]=x;
          }
        }
        public char pop(){
            if(isempty()){
                System.out.println("stack is empty");
                return '$';
            }else{int tem=top;
                top--;
             return arr[tem];
            }
        }
        public char peek(){
            if(isempty()){
                System.out.println("stack is empty");
                return '$';
            }
            else{
                return arr[top];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the characters in the infix expression ");
        String infix=sc.next();
        int n=infix.length();
        char postfix[]=new char[n];
        stack s = new stack(50);
        s.push('(');
        int x=0;
        for(int i =0;i<n;i++){
            if(inp_prec(infix.charAt(i))<stk_prec(s.peek())){
                s.push(infix.charAt(i));
            }else if((infix.charAt(i))==stk_prec(s.peek())){
                char k=s.pop();
            }
            else{
                postfix[x]=s.pop();
            }
        }
        for(int i =0;i<n;i++){
           System.out.print( postfix[i]+" ");
        }
        


        
    }
    
}
    

