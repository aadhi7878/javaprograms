import java.util.Scanner;

public class qsort {
    public void qusort(int[]a,int lb,int ub){
        if(lb<ub){
            int pos=partition(a,lb,ub);
            qusort(a, lb, pos-1);
            qusort(a, pos+1, ub);
        }
    }
    public int partition(int[]a,int lb,int ub){
        int i=lb;
        int j=ub;
        int piot =a[lb];
        while(i<j){
            while(i<=ub && a[i]<=piot){
                i=i+1;
            }
            while(a[j]>piot ){
                j=j-1;
            }
            if(i<j){
                int tem=a[i];
                a[i]=a[j];
                a[j]=tem;
            }
        }
        a[lb]=a[j];
        a[j]=piot;
        int pos=j;
        return pos;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the number");
            int x=sc.nextInt();
            a[i]=x;
        }
        qsort q=new qsort();
        // for (int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
        q.qusort(a, 0, n-1);
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
