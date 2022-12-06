import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// import java.util.HashSet;
// import java.util.LinkedHashSet;

public class collect5 {
    Set<Integer> s=new TreeSet<>();
    public void add(int ele){
        s.add(ele);
    }
    public void remove(int ele){
        s.remove(ele);
    }
    public boolean empty(){
            return s.isEmpty();
    }
    public int size(){
        return s.size();
    }
    public static void main(String[] args) {
        collect5 c=new collect5();
        for(int i =12 ;i>1;i--){
            c.add(i);
        }
        for(Integer elInteger:c.s){
            System.out.print(elInteger+" ");
        }
       
    }

}
