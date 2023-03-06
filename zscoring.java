import java.util.*;
public class zscoring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of data items :");
        int n=sc.nextInt();
        double dataitems[]=new double[n];
        System.out.println("enter all data items one by one :"); 
        for(int i=0;i<n;i++){
            dataitems[i]=Double.parseDouble(sc.next());
        }
        double mean=0;
        for(int i=0;i<n;i++){
            mean+=dataitems[i];
        }
        mean=mean/n;
        double standarddeviation=0;
        for(int i=0;i<n;i++){
            standarddeviation+=Math.pow(dataitems[i]-mean, 2);
        }
        standarddeviation=Math.sqrt(standarddeviation/n);
        double normalized[]=new double[n];
        for(int i=0;i<n;i++){
            normalized[i]=(dataitems[i]-mean)/standarddeviation;
        }
        for(int i=0;i<n;i++){
            System.out.print(normalized[i]+" ");
        }
    }
}
