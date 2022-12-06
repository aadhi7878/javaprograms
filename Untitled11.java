import java.util.*;
public class Untitled11 {
    public static void bbsort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void printlist(int arr[]){
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the no of elements");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        bbsort(a);
        printlist(a);
        System.out.println();
        sc.close();


    }
}
