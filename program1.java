import java.util.*;
public class program1 {
    public static int[] bubble(int[]a,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-j-1;j++){
                if(a[j]>a[j+1]){
                    int tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
        return a;
    }
    public static int bsearch(int[]a,int lb,int ub,int key){
           while(lb<=ub){
            int mid=lb+ub/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key){
                ub=mid-1;
            }else{
                lb=mid+1;
            }
           }
           return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of elements--");
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the number--");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number do you want t search");
        int key=sc.nextInt();
        int index=bsearch(bubble(a, n), 0, n-1, key);
        if(index==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at"+index+"th index");
        }
     sc.close();
        
    }
}
