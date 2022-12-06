import java.util.LinkedList;
public class book21two {
    LinkedList<Integer>l=new LinkedList<Integer>();
    public void enque(int x){
        l.add(x);
    }
    public int dequeue(){
        return l.pollFirst();
    }
    public int front(){
        return l.getFirst();
    }
    public int rear(){
        return l.getLast();
    }
    public static void main(String[] args) {
        book21two b=new book21two();
        b.enque(17);
        b.enque(44);
        b.enque(78);
        b.enque(10);
        System.out.println(b.dequeue());
        System.out.println(b.front());
        System.out.println(b.rear());
        System.out.println(b.l);
    }
}
