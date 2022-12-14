import java.util.Scanner;

public class practice {
    public static void Insertion_Sort(int[] arr, int lb, int ub){
    
        for(int i = 1;i<=ub;i++){
            int temp= arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
    }
    public static void printlist(int[] arr){
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int bsearch(int arr[],int key){
	
		int lb=0;
		int ub =arr.length - 1;
		while(lb<=ub){
			int mid = (lb+ub)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if(key<arr[mid]){
				ub=mid-1;
			}
			else{
				lb=mid+1;
			}
		}
		return -1;
	}
    
    public static void main(String[] args){
        System.out.println("enter the no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements....");
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Insertion_Sort(a,0,n-1);
        printlist(a);
        System.out.println();
        System.out.println("enter the key to search");
        int key = sc.nextInt();
        int result = bsearch (a, key);
        if(result== -1){
            System.out.println("key not found");
        }
        else if(result != -1){
            System.out.println("key value is present at indext :"+result+" and the value is : "+a[result]);
        }
        sc.close();
    }
}