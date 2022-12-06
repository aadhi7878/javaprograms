import java.util.HashMap;
import java.util.HashSet;

import java.util.*;
public class book25 {
    HashMap<Integer,String>h=new HashMap<>();
    public void insert(String s,int r){
        h.put(r,s);
    }
    public void keys(){
        System.out.println(h.keySet());
    }
    public void vals(){
        System.out.println(h.values());
    }
    public boolean isempty(){
        if(h.size()==0){
            return true;
        }else{
            return false;
        }
    }
    public int size(){
        return h.size();
    }
    public String getELE(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key--");
        return h.get(sc.nextInt());
    }
    public static void main(String[] args) {
        book25 b=new book25();
        b.insert("adfsaf", 12);
        b.insert("adfkj", 1);
        b.insert("asjdh", 13);
        b.insert("qwert", 10);
        b.keys();
        b.vals();
        System.out.println(b.isempty());
        System.out.println(b.size());
        System.out.println(b.h);
        System.out.println(b.getELE());
    }
}
