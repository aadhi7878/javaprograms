import java.util.*;
public class quick_sort {
   
    public int partition(int[] a, int lb,int ub){
        int i=lb;
        int j=ub;
        int p=a[lb];
        while(i<j){
            while((i<j) &&(a[i]<=p)){
                i=i+1;
            }
            while(a[j]>p){
                j=j-1;
            }
            if(i<j){
                int tem;
                 tem=a[i];
                 a[i]=a[j];
                 a[j]=tem;
            }
        }
        a[lb]=a[j];
            a[j]=p;
        int pos= j;
        return pos;    
    }
     public void Q_sort(int[] a,int lb,int ub){
    if(lb<ub){
    
        int pos =partition(a,lb,ub);
        System.out.println(a);
        Q_sort(a,lb,pos-1);
        System.out.println(a);
        Q_sort(a,pos+1,ub);
        System.out.println(a);
    }
}

    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("enter the number of elements");
        
        int n=Obj.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("enter %dth number:: ", i);
        
        a[i]=Obj.nextInt();
        }
        quick_sort object=new quick_sort();
        object.Q_sort(a,0, n-1);
        System.out.println("after quick sort");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }

     Obj.close();
    }

}
    

