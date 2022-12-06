import java.util.ArrayList;
import java.util.List;

public class collect2 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(12);
        l.add(334);
        l.remove(Integer.valueOf(334));
        // System.out.print(l.get(1));
        for (Integer elemeInteger:l){
            System.out.print(elemeInteger+" ");
        }
    }

}
