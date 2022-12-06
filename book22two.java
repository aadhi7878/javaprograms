import java.util.LinkedList;

public class book22two {
    LinkedList<Integer> l=new LinkedList<Integer>();
    public void enquefirst(int x){
        l.add(0, x);
    }
    public void enquelast(int x){
        l.add(l.size()-1, x);
    }
    public int dequefirst(){
        return l.pollFirst();
    }
    public int dequelast(){
        return l.pollLast();
    }
public boolean isempty(){
    if(l.size()==0){
        return true;
    }else{
        return false;
    }
}
     
    public static void main(String[] args) {
        book22two b=new book22two();
        b.enquefirst(11);
        b.enquefirst(77);
        b.enquelast(1);
        b.enquelast(99);
        System.out.println(b.dequefirst());
        System.out.println(b.dequelast());
        System.out.println(b.l);
    }
}
