

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    Queue<Integer> q=new LinkedList<>();
    public void enqueue(int ele){
        q.offer(ele);
    }
    public int dequeue(){
        return q.poll();
    }
    public int peek(){
        return q.peek();
    }
    // public static void main(String[] args) {
    //     cqueue c=new cqueue();
    //     c.enqueue(1);
    //     c.enqueue(45);
    //     c.enqueue(12);
    //     System.out.println(c.dequeue());


        
        
    //     System.out.println(c.q);
    //     System.out.println(c.peek());
    // }
}

    


