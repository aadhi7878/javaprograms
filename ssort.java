import java.util.*;
public class ssort {
    public void sort(String[]a,int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j].compareTo (a[min])<0){
                     min=j;
                }
            }
            String tem=a[min];
            a[min]=a[i];
            a[i]=tem;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.println("how many strings do you want to sort");
        n=sc.nextInt();
        String []a=new String[n];
        for(int i=0;i<n;i++){
           String x=sc.next();
           a[i]=x;
        }
        ssort s=new ssort();
        s.sort(a, n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
