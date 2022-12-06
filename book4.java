import java.util.*;
public class book4 {
    static boolean ispalindrome(String name){
        int n=name.length();
        for(int i=0;i<n/2;i++){
            if(name.charAt(i)!=name.charAt(n-i-1)){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string which do you want to check--");
        String s=sc.next();
        if(ispalindrome(s)==true){
            System.out.println("this string "+s.toUpperCase()+" is palindrome");
        }else{
            System.out.println("this string "+s.toUpperCase()+" is not a palindrome");
        }sc.close();
    }
}
