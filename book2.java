import java.util.*;
public class book2 {
    static int rmethod(int num){
        if (num==0 ||num==1){
            return num;
        }else{
            return rmethod(num-1)+rmethod(num-2);
        }
    }
    static int nrmethod(int num) { 
        if (num == 0) { 
            return 0; 
        }
    
        if (num == 1) {
            return 1; 
        } 
        int first = 0; 
        int second = 1; 
        int nth = 1; 
        for (int i = 2; i <= num; i++) { 
            nth = first + second;
            first = second;
            second = nth;
        } 
        return nth;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for N th term");
        int n =sc.nextInt();
        System.out.println("N th fibonachi term using non recursive method is "+nrmethod(n));
        System.out.println("N th fibonachi term using recursive method is "+rmethod(n));
        sc.close();
    }
}  
        

