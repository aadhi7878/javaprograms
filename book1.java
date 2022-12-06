import java.util.*;
public class book1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the multiple of x^2--");
        double a=sc.nextDouble();
        System.out.println("enter the multiple of x--");
        double b=sc.nextDouble();
        System.out.println("enter the constant--");
        double c=sc.nextDouble();
        double x=(b*b)-4*a*c;
        if(x<0){
            System.out.println("there is no real solutions");
        }else if(x==0){
            System.out.println("roots are same that root is :"+-b/(2*a)+"and"+b/(2*a));
        }else{
            System.out.println("roots are different those are :"+(-b+Math.sqrt(x))/2*a+"and"+(-b-Math.sqrt(x))/2*a);
        }
        sc.close();


    } 
}
