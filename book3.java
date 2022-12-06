import java.util.Scanner;

public class book3 {
    static boolean isprime(int n){
        if(n==1){
            return false;
        }else if (n==2){
            return true;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number--");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isprime(i)==false){
                System.out.print(i+" ");
            }
        }sc.close();
    }
}
