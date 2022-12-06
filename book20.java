import java.util.*;
public class book20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string which do you want to check if it is palindrome or not--");
        String x=sc.next();
        Stack s=new Stack<>();
        Queue q=new LinkedList<>();
        for(int i=0;i<x.length();i++){
            s.push(x.charAt(i));
        }
        for (int i =0;i<x.length();i++){
            q.offer(x.charAt(i));
        }
        String stackstring="";
        for(int i=0;i<x.length();i++){
            stackstring=stackstring+s.pop();
        }
        String queuestring="";
        for(int i=0;i<x.length();i++){
            queuestring=queuestring+q.remove();
        }
        if(stackstring.compareTo(queuestring)==0){
            System.out.println("it is a palindrome.");
        }else{
            System.out.println("it is not a palindrome.");
        }
        
    }
}

