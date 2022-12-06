
import java.util.Stack;

public class cstack {
    Stack<String> stack=new Stack<>();
    public void push( String ele){
        stack.push(ele);
    }
    public void pop(){
        stack.pop();
    }
    public void peek(){
        stack.peek();
    }
    // public static void main(String[] args){
    //     cstack c=new cstack();
    //     c.push("khsdk");
    //     c.push("kjsdnkj");
    //     System.out.println(c.stack);    
    // }
}
