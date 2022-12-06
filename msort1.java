import java.util.*;

public class msort1 {
    public  static void recur(int []arr,int lb,int ub) {
        if(lb<ub){
            int mid=(lb+ub)/2;
            recur(arr, lb, mid);
            recur(arr, mid+1, ub);
            merge(arr,lb,mid,ub);
        }
    }
    public static void merge(int arr[],int lb,int mid,int ub){
        int i=lb;
        int j=mid+1;
        int k=0;
        int n=ub-lb+1;
        int a[]=new int[n];
        while(i<=mid&&j<=ub){
            if(arr[i]<arr[j]){
                a[k]=arr[i];
                i++;
            }else{
                a[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            a[k]=arr[i];
            k++;
            i++;
        }while(j<=ub){
            a[k]=arr[j];
            k++;
            j++;

        }
        for(int x=0,l=lb;x<n;x++,l++){
            arr[l]=a[x];
            // System.out.print(arr[l]);
        }

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elements-->");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the number-->");
            arr[i]=sc.nextInt();
        }
        recur(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}
