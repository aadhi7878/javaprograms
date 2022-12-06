import java.util.*;
public class book22one {
    ArrayList <Integer> l=new ArrayList<Integer>();
    public void enquefirst(int x){
        l.add(0, x);
    }
    public void enquelast(int x){
        l.add((l.size()-1),x);
    }
    public int dequefirst(){
        int k=l.get(0);
        l.remove(0);
        return k;
    }
    public int dequelast(){
        int k=l.get(l.size()-1);
        l.remove(l.size()-1);
        return k;
    }
    public boolean isempty(){
        if(l.size()==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        book22one b=new book22one();
        b.enquefirst(12);
        b.enquefirst(10);
        b.enquelast(199);
        b.enquelast(111);
        System.out.println(b.dequefirst());
        System.out.println(b.dequelast());
        System.out.println(b.l);
     }
}
