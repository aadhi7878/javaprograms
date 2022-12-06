import java.util.Scanner;

public class lsearch {
    
     int lenearsearch(int[] arr,int lb,int ub,int key){
        while(lb<=ub){
            if(arr[lb]==key){
                return lb;
            }else{
                lb+=1;
                lenearsearch(arr, lb,ub, key);
            }
            
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n=sc.nextInt();
        int ub=n-1;
        int lb=0;
        int arr[]=new int[n];
        for (int i =0;i<n;i++){
            System.out.println("enter the numbers for array");
            arr[i]=sc.nextInt();
        }
        lsearch l=new lsearch();
        System.out.println("enter the key which do you want to search");
        int key=sc.nextInt();
        int x=l.lenearsearch(arr, lb, ub, key);
        if(x==-1){
            System.out.println("key not found");
        }else{
            System.out.println("element found at"+x+"th location");
        }
       sc.close();
       
    }
}
