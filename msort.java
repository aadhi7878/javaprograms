import java.util.*;
public class msort {
    public static void recur(int[]a,int lb,int ub){
        if(lb<ub){
            //int n =lb+(ub-lb)+1;
            int mid=(lb+ub)/2;
            recur(a, lb, mid);
            // for (int i=0;i<n;i++){
            //     System.out.print(a[i]+" ");
            // }
            recur(a, mid+1, ub);
            // for (int i=0;i<n;i++){
            //     System.out.print(a[i]+" ");
            // }
            merge(a,lb,mid,ub);
        }
    }
    public static void merge(int[]a,int lb,int mid,int ub){
        int i=lb;
        int j=mid+1;
        int k=0;
        int n=ub-lb+1;//important
        int[]m=new int[n];
        while(i<=mid && j<=ub){
            if(a[i]<a[j]){
                m[k]=a[i];
                
                i+=1;
            }else{
                m[k]=a[j];

                j+=1;
            }
            k+=1;
        }
        while(i<=mid){
            m[k]=a[i];
            i+=1;
            k+=1;
        }
        while(j<=ub){
            m[k]=a[j];
            j+=1;
            k+=1;
        }
        for (int x=0,l=lb;x<n;l++,x++){
            a[l]=m[x];
        }
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the number");
            int x=sc.nextInt();
            a[i]=x;
        }

        //msort m=new msort();
        recur(a,0, n-1);
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
