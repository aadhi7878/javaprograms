import java.util.*;
public class problem2 {
    public static void inssort(int[]a,int n){
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && key <a[j]){
                a[j+1]=a[j];
                j-=1;
            }
            a[j+1]=key;

        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number of elements--");
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the number--");
            a[i]=sc.nextInt();
        }
        inssort(a, n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

