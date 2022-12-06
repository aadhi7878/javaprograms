import java.util.*;

public class book7 {
    static int function(String a){
        StringTokenizer s=new StringTokenizer(a,",");
        int x=0;
        while(s.hasMoreTokens()){
            // System.out.println(s.nextToken());
            x=x+Integer.parseInt(s.nextToken());
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the inregers separeted with , in a one string--");
        String s=sc.next();
        System.out.println(function(s));
        sc.close();
    }
}
