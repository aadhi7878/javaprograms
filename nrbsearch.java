import java.util.*;


public class nrbsearch {
    public static int bsearch(int[]arr,int lb,int ub,int key) {
        while(lb<=ub){
            int mid =lb+ub/2;
            if(arr[mid]==key){
                return mid;
            }else{
                if(arr[mid]>key){
                    ub=mid-1;
                }else{
                    lb=mid+1;
                }
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of items want to insert in array-->");
        int n=sc.nextInt();
        int i;
        int []arr=new int [n];
        for( i=0;i<n;i++){
            System.out.println("enter the number-->");
            int x=sc.nextInt();
            arr[i]=x;
        }
    }
}
