import java.util.*;
public class lsearchnonr {
    int lsearch(int[] arr,int lb,int ub,int key){
        for(int i=lb;i<=ub;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter how many numbers do you want in array-");
        int n=sc.nextInt();
        int lb=0;
        int ub=n-1;
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the number for array-");
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the key do you want to search-");
        int key=sc.nextInt();
        lsearchnonr l=new lsearchnonr();
        int a=l.lsearch(arr, lb, ub, key);
        if(a==-1){
            System.out.print("element not found-");
        }else{
            System.out.println("element found at "+ a +" th index");
        }sc.close();
    }
    
}
