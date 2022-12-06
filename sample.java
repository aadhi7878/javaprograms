import java.util.*;
public class sample {
    public static void main(String[] args) {
        System.out.println("enter two nums");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("addition of two nums is ");
        System.out.println(c);
        sc.close();
    }
}
