import java.util.PriorityQueue;
import java.util.Queue;
// import java.util.*;

public class ccqueue {
    Queue<Integer> q=new PriorityQueue<>();
    public void enqueue(int ele){
        q.offer(ele);
    }
    public int dequeue(){
        return q.poll();
    }
    // public static void main(String[] args) {
    
    //     cqueue c=new cqueue();
    //     for(int i=0;i<10;i++){
    //         c.enqueue(i);
    //     }
    //     for(Integer eleInteger : c.q){
    //         System.out.print(eleInteger+" ");
    //     }
    // }
}
