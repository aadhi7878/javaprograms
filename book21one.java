import java.util.LinkedList;

public class book21one {
    LinkedList<Integer> l=new LinkedList<Integer>();
    public void push(int x){
        l.add(x);
    }
    public int pop(){
        return l.pollLast();
    }
    public int peek(){
        return l.get(l.size()-1);
    }
    public static void main(String[] args) {
        book21one b=new book21one();
        b.push(13);
        b.push(88);
        b.push(63);
        b.push(11);
        System.out.println(b.pop());
        System.out.println( b.peek());
        System.out.println(b.l);
    }
}
