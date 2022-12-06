
import java.util.*;

public class quicksort1 {
    public void qsort(int arr[],int lb,int ub){
        if(lb<ub){
            int pos=partiotion(arr,lb,ub);
            qsort(arr, lb,pos-1);
            qsort(arr, pos+1, ub);
        }
    }
    public int partiotion(int arr[],int lb,int ub){
        int i=lb;
        int j=ub;
        int piot=arr[lb];
        while(i<j){
            while(i<=ub && arr[i]<=piot){
                i=i+1;
            }
            while(arr[j]>piot){
                j=j-1;
            }if(i<j){
                int tem=arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
            }
            

        }arr[lb]=arr[j];
        arr[j]=piot;
        // int pos=j;
        return j;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of numbers-->");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enterr the number-->");
            arr[i]=sc.nextInt();
        }
        quicksort1 q=new quicksort1();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        q.qsort(arr, 0 , n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
sc.close();
    }
}
