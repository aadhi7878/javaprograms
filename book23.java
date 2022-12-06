import java.util.PriorityQueue;

public class book23 {
    PriorityQueue<Integer>p =new PriorityQueue<>();
    public void insertelement(int x){
        p.add(x);
    }
    public boolean isempty(){
        if(p.size()==0){
            return true;
        }else{
            return false;
        }
    }
    public int findmin(){
        return p.peek();
    }
    public void delete(int x){
        p.remove(Integer.valueOf(x));
    }
    public void delete(){
        p.remove();
    }
    public static void main(String[] args) {
        book23 b=new book23();
        b.insertelement(13);
        b.insertelement(1);
        b.insertelement(22);
        b.insertelement(91);
        b.insertelement(15);
        b.delete(22);
        b.delete();     //it deletes first element in the queue 
        System.out.println(b.isempty());
        System.out.println(b.findmin());
        System.out.println(b.p);
    }
}
