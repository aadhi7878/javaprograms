import java.util.*;
public class book5 {
    static void bubblesort(String []arr,int n){
        for (int i=0;i<n;i++){
            for(int k=1;k<n-1;k++){
                if((arr[k-1]).compareTo(arr[k])>0){
                   String t=arr[k-1];
                   arr[k-1]=arr[k];
                   arr[k]=t; 
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many strings do you want to sort--");
        int n=sc.nextInt();
        String arr[]=new String[n];
        for (int i=0;i<n;i++){
        System.out.println("enter the string--");
        arr[i]=sc.next();
        }
        bubblesort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }sc.close();
    }
    
}
